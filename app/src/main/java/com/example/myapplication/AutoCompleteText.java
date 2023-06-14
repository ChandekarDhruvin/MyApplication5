package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class AutoCompleteText extends AppCompatActivity {
    AutoCompleteTextView autotext;
    ArrayList<String> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text);

        autotext = findViewById(R.id.auto_complete_text);

        arrayList.add("India");
        arrayList.add("China");
        arrayList.add("UK");
        arrayList.add("USA");
        arrayList.add("JAPAN");
        arrayList.add("PAKISTAN");
        arrayList.add("AUSTRALIA");
        arrayList.add("CANADA");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrayList);
        autotext.setAdapter(arrayAdapter);

    }
}