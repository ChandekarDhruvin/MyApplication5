package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class AFragment extends Fragment {



    private static String NAME1 = "para1";
    private static String CODE1 = "para2";

    public AFragment() {
        // Required empty public constructor
    }

    public static Fragment getInstance(String name1,int code){
        AFragment aFragment = new AFragment();
        Bundle bundle = new Bundle();
        bundle.putString(NAME1,name1);
        bundle.getInt(CODE1,code);
        aFragment.setArguments(bundle);
        return aFragment;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(getArguments()!=null){
            String Name = getArguments().getString(NAME1);
            int Code = getArguments().getInt(CODE1);
            Log.d("Values of name and code ","Name : "+Name + "Code : " + Code);

        }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }
}