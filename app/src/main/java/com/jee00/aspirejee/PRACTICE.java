package com.jee00.aspirejee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

public class PRACTICE extends AppCompatActivity {
    private long backPressedTime;
    private Toast backToast;
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);


    }
    @Override
    public void onBackPressed() {
        if(backPressedTime+1000> System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;
        }
        else
        {
            backToast= Toast.makeText(getBaseContext(),"Press back again to Exit",Toast.LENGTH_SHORT);
            backToast.show();
            if(webview.canGoBack())
            {
                webview.goBack();
            }
        }
        backPressedTime=System.currentTimeMillis();
    }
}