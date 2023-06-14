package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageChangeAPP extends AppCompatActivity {

    ImageButton prev,next;
    ImageView img;
    TextView textView;
    int currentImage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_change_app);
    }

    public void prev(View view) {
        String idx = "img" + currentImage;
        int x = this.getResources().getIdentifier(idx,"id",getPackageName());
        img = findViewById(x);
        img.setAlpha(0f);

        currentImage = (3 + currentImage - 1) %3;
        String idY = "img" + currentImage;
        int y =  this.getResources().getIdentifier(idY,"id",getPackageName());
        img = findViewById(x);
        img.setAlpha(1f);
    }
    public void next(View view) {
        String idx = "img" + currentImage;
        int x = this.getResources().getIdentifier(idx,"id",getPackageName());
        img = findViewById(x);
        img.setAlpha(0f);

        currentImage = (currentImage + 1) %3;
        String idY = "img" + currentImage;
        int y =  this.getResources().getIdentifier(idY,"id",getPackageName());
        img = findViewById(x);
        img.setAlpha(1f);
    }
}