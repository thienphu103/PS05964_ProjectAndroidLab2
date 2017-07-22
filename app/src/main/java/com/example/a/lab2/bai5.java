package com.example.a.lab2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bai5 extends AppCompatActivity {
    int a = 0;
    int b = 0;

    int test = 1;
    EditText txte1;
    EditText txte2;
    TextView txtsolve;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai5);
        txte1 = (EditText) findViewById(R.id.txta);
        txte2 = (EditText) findViewById(R.id.txtb);
        txte1.setHint("Input a");
        txte2.setHint("Input b");


        txtsolve = (TextView) findViewById(R.id.txtS);
        btn = (Button) findViewById(R.id.button);

        txte1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                txtsolve.setText("");
                return false;
            }
        });
        txte2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                txtsolve.setText("");
                return false;
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(txte1.getText().toString());
                b = Integer.parseInt(txte2.getText().toString());

                if (txte1.getText().toString().equals("")) {
                    txte1.setText("Enter Number not Empty . Please!!!");
                    txte1.setTextColor(Color.RED);
                    txte1.setOnTouchListener(new View.OnTouchListener() {
                        @Override
                        public boolean onTouch(View v, MotionEvent event) {
                            txte1.setText("");
                            txte1.setTextColor(Color.BLACK);
                            return false;
                        }
                    });
                }
                if (txte2.getText().toString().equals("")) {
                    txte2.setText("Enter Number not Empty . Please!!!");
                    txte2.setTextColor(Color.RED);
                    txte2.setOnTouchListener(new View.OnTouchListener() {
                        @Override
                        public boolean onTouch(View v, MotionEvent event) {
                            txte2.setText("");
                            txte2.setTextColor(Color.BLACK);
                            return false;
                        }
                    });
                }
                if (a > b) {
                    txtsolve.setText("Vui Long Nhap A < B, Xin cam on");
                    txtsolve.setTextColor(Color.RED);
                }
                a++;
                b--;
                for (int i = a; i <= b; i++) {//vong lap lớn
                    int dem = 0;
                    for (int j = 2; j <= i; j++) {//vong lap kiem tra so nguyen to
                        if (i % j == 0) {
                            dem++;
                        }
                    }
                    if (dem == 1) {//nếu là số nguyên tố thì đếm tăng lên và thõa dk
                        txtsolve.append(i + " ");
                        txtsolve.setTextColor(Color.BLUE);
                    }

                }
            }
        });
    }


}

