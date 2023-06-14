package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TicTacToe extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnrestart;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    TextView tvResult;

    int flag = 0;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);
        initValue();
    }

    private void initValue() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        tvResult = findViewById(R.id.tvResult);
        btnrestart = findViewById(R.id.btnRestart);
    }

    public void checkResult(View view) {
        Button btnView = (Button) view;
        count++;
        if(btnView.getText().toString().equals("")){
            if(flag == 0){
                btnView.setText("X");
                flag = 1;
                RestartGame();
            }else {
                btnView.setText("O");
                flag = 0;
                RestartGame();

            }

            if(count>4){
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();


                if(b1.equals(b2) && b2.equals(b3) && !b1.equals("")){
                    Toast.makeText(this, "WIN" + b1, Toast.LENGTH_LONG).show();
                    tvResult.setText("WIN " + b1);
                    RestartGame();

                }
                else if(b4.equals(b5) && b5.equals(b6) && !b5.equals("")){
                    Toast.makeText(this, "WIN" + b5, Toast.LENGTH_LONG).show();
                    tvResult.setText("WIN " + b5);
                    RestartGame();


                }
                else if(b7.equals(b8) && b8.equals(b9) && !b8.equals("")){
                    Toast.makeText(this, "WIN" + b7, Toast.LENGTH_LONG).show();
                    tvResult.setText("WIN " + b7);
                    RestartGame();

                }
                else if(b1.equals(b4) && b4.equals(b7) && !b1.equals("")){
                    Toast.makeText(this, "WIN" + b1, Toast.LENGTH_LONG).show();
                    tvResult.setText("WIN " + b7);
                    RestartGame();

                }
                else if(b2.equals(b5) && b5.equals(b8) && !b8.equals("")){
                    Toast.makeText(this, "WIN" + b2, Toast.LENGTH_LONG).show();
                    tvResult.setText("WIN " + b2);
                    RestartGame();

                }
                else if(b3.equals(b6) && b6.equals(b9) && !b6.equals("")){
                    Toast.makeText(this, "WIN" + b3, Toast.LENGTH_LONG).show();
                    tvResult.setText("WIN " + b3);
                    RestartGame();

                }
                else if(b1.equals(b5) && b5.equals(b9) && !b5.equals("")){
                    Toast.makeText(this, "WIN" + b1, Toast.LENGTH_LONG).show();
                    tvResult.setText("WIN " + b1);
                    RestartGame();

                }
                else if(b3.equals(b5) && b5.equals(b7) && !b7.equals("")){
                    Toast.makeText(this, "WIN" + b3, Toast.LENGTH_LONG).show();
                    tvResult.setText("WIN " + b3);
                    RestartGame();

                }else if(count==9){
                    Toast.makeText(this, "Tie.....", Toast.LENGTH_SHORT).show();
                    tvResult.setText("TIE....");
                    RestartGame();

                }

            }
        }

    }

    private void RestartGame(){
        btnrestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restartGame();
            }
        });
    }

    private void delayRestart() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                restartGame();
            }
        },5000);
    }

    private void restartGame() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count = 0;
        flag = 0;
        tvResult.setText("");

    }
}