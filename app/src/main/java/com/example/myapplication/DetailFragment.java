package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailFragment extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private static final String FNAME = "Fname";
    private static final String LNAME = "Lname";
    private static final int AGE = Integer.parseInt("Age");



    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mfname;
    private String mlname;

    private String mParam2;
    private int mParam3;


    public DetailFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DetailFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DetailFragment newInstance(String param1, String param2) {
        DetailFragment fragment = new DetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);

        fragment.setArguments(args);
        return fragment;
    }

    public static Fragment getInstance(String fname, String lname, int age) {

        DetailFragment fragment = new DetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString(FNAME, String.valueOf(fname));
        bundle.putString(LNAME, String.valueOf(lname));
        bundle.putInt(String.valueOf(AGE),Integer.parseInt(String.valueOf(age)));
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        if (getArguments() != null) {

            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            mfname = getArguments().getString("fname");
            mlname = getArguments().getString("lname");
            mParam3 = Integer.parseInt(getArguments().getString("age"));

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(getArguments()!=null){
            String name = getArguments().getString(FNAME);
            String lname = getArguments().getString(LNAME);
            int age = getArguments().getInt(String.valueOf(AGE));
        }

        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_detail, container, false);
        TextView firstName = view.findViewById(R.id.fnameFrame);
        TextView lastName = view.findViewById(R.id.lnameFrame);
        TextView age = view.findViewById(R.id.ageFrame);
        return view;
    }
}