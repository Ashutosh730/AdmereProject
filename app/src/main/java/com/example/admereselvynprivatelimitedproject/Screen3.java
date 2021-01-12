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

import android.view.View;

import org.json.JSONException;
import org.json.JSONObject;

public class Screen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        JSONObject data = new JSONObject();
        try {
            data.put("mobile", /* mobile text field input (integer) */);
            data.put("password", /* mobile text field input (string)*/);

            JsonObjectRequest request = new JsonObjectRequest(Request.Method.POST, "https://mekvahan.com/api/android_intern_task", data,
                    new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(JSONObject response) {

                            if (response.getBoolean("status")) {
                                // Login successful
                            } else {
                                // login failed
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            });

            RequestQueue queue = Volley.newRequestQueue(mContext);
            queue.add(request);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}