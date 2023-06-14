package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginSp extends AppCompatActivity {
    Button btnLogin;
    EditText name,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sp);
        btnLogin = findViewById(R.id.btn_addSP);
        name = findViewById(R.id.edt_usernameSP);
        pass = findViewById(R.id.edt_passwordSP);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp= getSharedPreferences("login",MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("username",name.getText().toString());
                editor.putString("password",pass.getText().toString());
                editor.putBoolean("flag",true);
                editor.apply();
            }
        });
    }
}