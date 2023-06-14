package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sp = getSharedPreferences("login",MODE_PRIVATE);
                boolean check = sp.getBoolean("flag",false);

                Intent i;
                if(check){
                    i = new Intent(SplashScreen.this,HomeSp.class);
                }else{
                    i = new Intent(SplashScreen.this,LoginSp.class);
                }
                startActivity(i);
                finish();
            }
        },3000);
    }
}