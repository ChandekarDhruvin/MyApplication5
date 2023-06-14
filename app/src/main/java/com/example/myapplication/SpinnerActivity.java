package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity {
    Spinner spinner;
    ArrayList<String> country = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinner  = findViewById(R.id.spinner1);
        country.add("India");
        country.add("Japan");
        country.add("USA");
        country.add("China");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,country){
          @Override
          public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//              return super.getDropDownView(position, convertView, parent);
              boolean isSelected = false;
              TextView tvdata = (TextView) super.getDropDownView(position, convertView, parent);



                  tvdata.setTextColor(Color.YELLOW);

              return  tvdata;
          }


        };

        spinner.setAdapter(arrayAdapter);

    }
}