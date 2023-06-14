package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class TabLayoutNewActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout_new);

        tabLayout = findViewById(R.id.tab);
        viewPager = findViewById(R.id.viewPager);

        ViewPageMessangerAdapter viewPageMessangerAdapter = new ViewPageMessangerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPageMessangerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}