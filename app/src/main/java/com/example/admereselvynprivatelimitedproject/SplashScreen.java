package com.example.admereselvynprivatelimitedproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        //
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent SwitchToScreen1 = new Intent(SplashScreen.this,Screen1.class);
                startActivity(SwitchToScreen1);
                finish();
            }
        }, 3000);
    }
}