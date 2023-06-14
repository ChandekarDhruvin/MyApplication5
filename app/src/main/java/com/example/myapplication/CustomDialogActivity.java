package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActionBarOverlayLayout;

import android.app.ActionBar;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

public class CustomDialogActivity extends AppCompatActivity {
    Button btnDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog);

        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.raw_custom_dialog_layout);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.dialogbox_design));
        btnDone = dialog.findViewById(R.id.btn_okay);
        dialog.setCancelable(false);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CustomDialogActivity.this, "Done...", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        dialog.show();
        dialog.getWindow().setGravity(Gravity.CENTER_HORIZONTAL);

    }
}