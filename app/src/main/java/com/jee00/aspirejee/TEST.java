package com.jee00.aspirejee;

import android.app.Dialog;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class TEST extends AppCompatActivity {
private WebView webview;
private long backPressedTime;
private Toast backToast;
private TextView title,timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

//findView
        title=findViewById(R.id.title);
        timer=findViewById(R.id.timer);
        ImageView alert=findViewById(R.id.alerttt);
        webview=findViewById(R.id.webview);

        getSupportActionBar().hide();

//firebase_info_catch
        String Title=getIntent().getStringExtra("title");
        String link=getIntent().getStringExtra("linkk");

//seting_gathered info
        title.setText(Title);

//alert_box_time_over
        Dialog alertt = new Dialog(TEST.this);
        alertt.setContentView(R.layout.alert);
        alertt.getWindow().setBackgroundDrawable(getDrawable(R.drawable.alertt));
        alertt.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        alertt.getWindow().getAttributes().windowAnimations=R.style.animation;

//timer
        long duration= TimeUnit.MINUTES.toMillis(181);
        new CountDownTimer(duration, 1000) {
            @Override
            public void onTick(long l) {
                String sDuration=String.format(Locale.ENGLISH,"%02d:%02d"
                        ,TimeUnit.MILLISECONDS.toMinutes(l)
                        ,TimeUnit.MILLISECONDS.toSeconds(l)-TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(l)));
            timer.setText(sDuration);   //clock_representation
            }

            @Override
            public void onFinish() {
                Toast.makeText(getApplicationContext(),"EXAM OVER! SUBMIT GOOGLE FORM",Toast.LENGTH_LONG).show();
                alert.setVisibility(View.VISIBLE); //alert_img_visible
                alertt.show();
                Button btn=alertt.findViewById(R.id.okay);
                btn.setOnClickListener(v -> alertt.dismiss());
            }
        }.start();

//webview_controll
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl(link);
        WebSettings webSettings=webview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webview.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webview.getSettings().setAppCacheEnabled(true);
        webview.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webSettings.setSaveFormData(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setDomStorageEnabled(true);
    }

//double_click to exit
    @Override
    public void onBackPressed() {
        if(backPressedTime+1000> System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;
        }
        else
        {
            backToast=Toast.makeText(getBaseContext(),"Press back again to Exit",Toast.LENGTH_SHORT);
            backToast.show();
            if(webview.canGoBack())
            {
                webview.goBack();
            }
        }
        backPressedTime=System.currentTimeMillis();
    }
}