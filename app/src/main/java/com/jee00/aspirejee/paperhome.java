package com.jee00.aspirejee;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.jee00.aspirejee.Model.Papers;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class paperhome extends AppCompatActivity {

    RecyclerView recyclerView;
    FirebaseRecyclerAdapter<Papers, CategoryViewHolder> adapter;
    RecyclerView.LayoutManager manager;
    FirebaseDatabase database;
    DatabaseReference reference;
    Dialog dialog;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paperhome);

//dialog_box selection b/w test$practice
        dialog=new Dialog(paperhome.this);
        dialog.setContentView(R.layout.test_prac_dialog);
        dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.bg_dialog));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().getAttributes().windowAnimations=R.style.animation;

//findView inside dialog
        TextView Date=dialog.findViewById(R.id.date);
        TextView Shift=dialog.findViewById(R.id.shift);
        Button test=dialog.findViewById(R.id.testt);
        Button prac=dialog.findViewById(R.id.practice);
        TextView T_mark=dialog.findViewById(R.id.mark);
        TextView T_ques=dialog.findViewById(R.id.ques);


//firebase_calling
        database= FirebaseDatabase.getInstance();
        reference=database.getReference("Papers");

        manager=new LinearLayoutManager(this);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(manager);

 //waiting msg while loading recyclerView
        long duration= TimeUnit.SECONDS.toMillis(2);
        new CountDownTimer(duration, 1000) {
            @Override
            public void onTick(long l) {
                String sDuration=String.format(Locale.ENGLISH,"%02d"
                        ,TimeUnit.MILLISECONDS.toSeconds(l));
             Toast.makeText(paperhome.this,"Please wait! Connecting to Internet",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFinish() {
                TextView textView=findViewById(R.id.warn);
                textView.setVisibility(View.INVISIBLE);
            }
        }.start();

//firebase_gathering info
        FirebaseRecyclerOptions<Papers> options=new FirebaseRecyclerOptions.Builder<Papers>()
                .setQuery(reference,Papers.class)
                .build();

        adapter=new FirebaseRecyclerAdapter<Papers, CategoryViewHolder>(options) {

            //catching info from firebase
            @Override
            protected void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int i, @NonNull Papers category) {
                categoryViewHolder.Date.setText(category.getDate());
                categoryViewHolder.Shift.setText(category.getShift());
                categoryViewHolder.relativeLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//setting info in dialog
                        Date.setText(category.getDate());
                        Shift.setText(category.getShift());
                        T_mark.setText(category.getTotal_M());
                        T_ques.setText(category.getTotal_Q());
                        dialog.show();
                        test.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
 //transfering firebase info to TEST.class
                                Intent intent=new Intent(paperhome.this, TEST.class);
                                intent.putExtra("title",category.getDate());
                                intent.putExtra("shiftt",category.getShift());
                                intent.putExtra("linkk",category.getTestlink());
                                startActivity(intent);
                            }
                        });
                    }
                });
            }

//inflating the info in recyclerView from database
            @NonNull
            @Override
            public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View v1= LayoutInflater.from(getBaseContext())
                        .inflate(R.layout.paperhome_btns_firebase,parent,false);
                return new CategoryViewHolder(v1);
            }


        };
        adapter.startListening();
        adapter.notifyDataSetChanged();
        recyclerView.setAdapter(adapter);

    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        public TextView Date;
        public TextView Shift;
        public RecyclerView category_recyclerView;
        public RecyclerView.LayoutManager manager;
        RelativeLayout relativeLayout;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

//finding view in paperhome_btn_firebase
            relativeLayout=itemView.findViewById(R.id.whole_btn);
            manager=new LinearLayoutManager(itemView.getContext(),LinearLayoutManager.HORIZONTAL,false);
            Date=itemView.findViewById(R.id.date);
            Shift=itemView.findViewById(R.id.shift);
            category_recyclerView=itemView.findViewById(R.id.recyclerView);
            category_recyclerView.setLayoutManager(manager);
        }

    }
}
