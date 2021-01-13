package com.example.admereselvynprivatelimitedproject;

import android.os.Bundle;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class Screen3 extends AppCompatActivity {

    private EditText enterNumber, password;
    private Button proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        enterNumber = findViewById(R.id.enterNumber);
        password = findViewById(R.id.password);
        proceed = findViewById(R.id.proceed);


        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setProceed();
            }
        });
    }

    private void setProceed(){
        JSONObject data = new JSONObject();
        try {
            data.put("mobile", Integer.parseInt(enterNumber.getText().toString()));
            data.put("password",password.getText().toString());

            JsonObjectRequest request = new JsonObjectRequest(Request.Method.POST, "https://mekvahan.com/api/android_intern_task", data,
                    new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(JSONObject response) {

                            try {
                                if (response.getBoolean("status")) {
                                    Toast.makeText(Screen3.this, "Login successful", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(Screen3.this, "Login failed", Toast.LENGTH_SHORT).show();
                                }
                            } catch (JSONException e) {

                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.v("Error",error.getMessage());
                }
            });

                RequestQueue queue = Volley.newRequestQueue(Screen3.this);
                queue.add(request);
            } catch (JSONException e) {
                e.printStackTrace();
        }
    }
}