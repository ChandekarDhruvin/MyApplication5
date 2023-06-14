package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class BottomBarActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_bar);
        bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                    onLoad(new AFragment(),1);

                 if (id == R.id.nav_search){
                    onLoad(new BFragment(),0);

                }else if (id == R.id.nav_add){
                    onLoad(new CallsFragment(),0);

                }else if (id == R.id.nav_Reels){
                    onLoad(new ChatsFragment(),0);

                }else if (id == R.id.nav_profile){
                    onLoad(new CFragment(),0);

                }else{
                    onLoad(new StatusFragment(),0);

                }
                return true;
            }
        });
        bottomNavigationView.setSelectedItemId(R.id.nav_home);
    }

    private void onLoad(Fragment fragment,int flag) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction  = fragmentManager.beginTransaction();
        if(flag == 1){
            fragmentTransaction.add(R.id.frame_layout1,fragment);
        }else{
            fragmentTransaction.replace(R.id.frame_layout1,fragment);
        }
        fragmentTransaction.commit();
    }
}