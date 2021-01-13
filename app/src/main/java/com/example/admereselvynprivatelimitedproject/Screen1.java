
package com.example.admereselvynprivatelimitedproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen1 extends AppCompatActivity {

    //Declaration of Views...
//    private Button getStarted;
    private Button logIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);

        //Initiation of Views...
//        getStarted = findViewById(R.id.getStarted);
        logIn = findViewById(R.id.logIn);

        //Switching to corresponding activity...
//        getStarted.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent logInActivity = new Intent(Screen1.this, Screen2.class);
//                startActivity(logInActivity);
//            }
//        });

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logInActivity = new Intent(Screen1.this, Screen2.class);
                startActivity(logInActivity);
            }
        });
    }
}