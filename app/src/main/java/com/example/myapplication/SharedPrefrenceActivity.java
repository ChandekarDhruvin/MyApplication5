package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SharedPrefrenceActivity extends AppCompatActivity {
    EditText usname,pass,uid,uclg,uage,ucontact;
    Button btnAdd,btndel;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_prefrence);
        usname = findViewById(R.id.edt_username);
        pass = findViewById(R.id.edt_password);
        btnAdd = findViewById(R.id.btn_add);
        tv = findViewById(R.id.tv_add);
        btndel = findViewById(R.id.btn_del);
        uid = findViewById(R.id.edt_username_id);
        uclg = findViewById(R.id.edt_username_clg);
        uage = findViewById(R.id.edt_username_age);
        ucontact = findViewById(R.id.edt_username_contact);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getSharedPreferences("demo",MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("username",usname.getText().toString());
                editor.putString("password",pass.getText().toString());
                editor.putString("userid",uid.getText().toString());
                editor.putString("userclg",uclg.getText().toString());
                editor.putString("userage",uage.getText().toString());
                editor.putString("usercontact",ucontact.getText().toString());
                editor.apply();


//                tv.setText("Inserted Succesfully");
//                tv.setTextColor(Color.GREEN);

            }
        });
        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                SharedPreferences sp  = getSharedPreferences("demo",MODE_PRIVATE);
//                SharedPreferences.Editor editor = sp.edit();
//                editor.clear();
//                editor.apply();
//                usname.setText("");
//                pass.setText("");
//                uid.setText("");
//                uclg.setText("");
//                uage.setText("");
//                ucontact.setText("");

//                tv.setText("Deleted SuccesFully");
//                tv.setTextColor(Color.RED);
                checkDetails();

            }
        });
    }

    private void checkDetails() {
        SharedPreferences sp = getSharedPreferences("demo",MODE_PRIVATE);
        if(sp.contains("username")){
            usname.setText(sp.getString("username",""));
            pass.setText(sp.getString("password",""));
            uid.setText(sp.getString("userid",""));
            uclg.setText(sp.getString("userclg",""));
            uage.setText(sp.getString("userage",""));
            ucontact.setText(sp.getString("usercontact",""));

        }else{
            tv.setText("Record Not Found");
            tv.setTextColor(Color.CYAN);
        }
    }
}