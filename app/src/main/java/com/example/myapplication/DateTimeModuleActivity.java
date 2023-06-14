package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class DateTimeModuleActivity extends AppCompatActivity {
    Button btnDate,btnTime;

    TextView tvdate,tvtime;
    int year,month,date,hour,min;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time_module);

        btnDate = findViewById(R.id.btn_date);
        tvdate = findViewById(R.id.tv_date);
        tvtime = findViewById(R.id.tv_time);
        btnTime = findViewById(R.id.tv_btn_time);

        Calendar calendar = Calendar.getInstance();

        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        date = calendar.get(Calendar.DATE);
        hour = calendar.get(Calendar.HOUR);
        min = calendar.get(Calendar.MINUTE);

        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(DateTimeModuleActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        tvdate.setText(date + "/" + (month + 1) + "/" + year);
                    }
                },year,month,date);
                datePickerDialog.show();
            }
        });

        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(DateTimeModuleActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {
                        tvtime.setText(i + ":" + i1);
                    }
                },hour,min,true);
                timePickerDialog.show();
            }
        });

    }
}