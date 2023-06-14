package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DetailsTakingActivity extends AppCompatActivity {
    EditText fname,lname,page;
    Button gotof;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_taking);
        fname = findViewById(R.id.fname);
        lname = findViewById(R.id.lname);
        page = findViewById(R.id.age);
        gotof = findViewById(R.id.btngotoFrag);


        gotof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Bundle bundle = new Bundle();

                bundle.putString("fname", fname.getText().toString());
                bundle.putString("lname", lname.getText().toString());
                bundle.putInt("age", Integer.parseInt(String.valueOf(page)));
               DetailFragment detailFragment = new DetailFragment();
               detailFragment.setArguments(bundle);
               fragmentTransaction.replace(R.id.framedetails,detailFragment).commit();



            }
        });
    }

    private void Load(Fragment f) {



    }
}