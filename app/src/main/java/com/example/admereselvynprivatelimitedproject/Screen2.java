package com.example.admereselvynprivatelimitedproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Screen2 extends AppCompatActivity {

    private LinearLayout enterNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        enterNumber = findViewById(R.id.enterNumber);

        enterNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchActivity = new Intent(Screen2.this, Screen3.class);
                startActivity(switchActivity);
            }
        });
    }
}