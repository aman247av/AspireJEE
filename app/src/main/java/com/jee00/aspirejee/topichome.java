package com.jee00.aspirejee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class topichome extends AppCompatActivity {
    public Button bttn1;
    public Button bttn2;
    public Button bttn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topichome);
        bttn1=findViewById(R.id.button);
        bttn2=findViewById(R.id.button5);
        bttn3=findViewById(R.id.button6);

        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(topichome.this,phytopic.class);
                startActivity(intent);
            }
        });

        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(topichome.this, chemtopic.class);
                startActivity(intent);
            }
        });

        bttn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(topichome.this,mathtopic.class);
                startActivity(intent);
            }
        });

    }
}