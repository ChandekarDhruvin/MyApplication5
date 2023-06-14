package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class GradeView11 extends AppCompatActivity {
    GridView gridView;
    ArrayList<String> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_view11);
        gridView = findViewById(R.id.grid1);

        arrayList.add("BMW");
        arrayList.add("MERCEDES");
        arrayList.add("HONDA");
        arrayList.add("TATA");
        arrayList.add("TOYOTA");
        arrayList.add("BAJAJ");
        arrayList.add("FORD");
        arrayList.add("VOLKSWAGEN");
        arrayList.add("FERRARI");
        arrayList.add("BENTLEY");
        arrayList.add("LG");
        arrayList.add("SAMSUNG");
        arrayList.add("APPLE");
        arrayList.add("NOKIA");
        arrayList.add("ACER");
        arrayList.add("LENOVO");
        arrayList.add("DELL");
        arrayList.add("HP");
        arrayList.add("MOTOROLA");
        arrayList.add("VIVO");
        arrayList.add("OPPO");
        arrayList.add("OKAY!");


//
//        for(int i= 1;i<=400;i++){
//            arrayList.add(i);
//        }

//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrayList);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getApplicationContext(),R.layout.activity_listview1,arrayList);

        gridView.setAdapter(arrayAdapter);
//
//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                int a = arrayList.get(i);
//                Toast.makeText(GradeView11.this, "Sqaure : " + (a*a), Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}