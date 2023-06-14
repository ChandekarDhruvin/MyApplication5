package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class HomeSp extends AppCompatActivity {
    Button btnlogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_sp);
        btnlogout = findViewById(R.id.btn_logoutSP);
        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp  = getSharedPreferences("login",MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putBoolean("flag",false);
                editor.apply();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(HomeSp.this,LoginSp.class);
                        startActivity(i);
                        finish();
                    }
                },2000);
            }
        });
    }
}