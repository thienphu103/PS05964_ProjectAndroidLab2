package com.example.a.lab2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bai3 extends AppCompatActivity {
    double a = 0, b = 0, c = 0;
    EditText txte1;
    EditText txte2;
    EditText txte3;
    TextView txtsolve1;
    TextView txtsolve2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        txte1 = (EditText) findViewById(R.id.txta2);
        txte2 = (EditText) findViewById(R.id.txtb2);
        txte3 = (EditText) findViewById(R.id.txtc2);
        txtsolve1 = (TextView) findViewById(R.id.txtS1);
        txtsolve2 = (TextView) findViewById(R.id.txtS2);
        txte1.setHint("Input a");
        txte2.setHint("Input b");
        txte3.setHint("Input c");

        btn = (Button) findViewById(R.id.btnS2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Double.parseDouble(txte1.getText().toString());
                b = Double.parseDouble(txte2.getText().toString());
                c = Double.parseDouble(txte3.getText().toString());

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
                if (txte3.getText().toString().equals("")) {
                    txte3.setText("Enter Number not Empty . Please!!!");
                    txte3.setTextColor(Color.RED);
                    txte3.setOnTouchListener(new View.OnTouchListener() {
                        @Override
                        public boolean onTouch(View v, MotionEvent event) {
                            txte3.setText("");
                            txte3.setTextColor(Color.BLACK);
                            return false;
                        }
                    });
                }
                if (a == 0) {
                    if (b == 0.0) {
                        if (c == 0.0) {
                            txtsolve1.setText("Phuong Trinh Vo So Nghiem");
                            txtsolve2.setText("");
                            txtsolve1.setTextColor(Color.BLUE);
                            txtsolve2.setTextColor(Color.BLUE);
                        } else {
                            txtsolve1.setText("Phuong Trinh Vo Nghiem");
                            txtsolve2.setText("");
                            txtsolve1.setTextColor(Color.BLUE);
                            txtsolve2.setTextColor(Color.BLUE);
                        }
                    } else {
                        double kq = -c / b;
                        txtsolve1.setText("Phương Trình Có Nghiệm: " + kq);
                        txtsolve2.setText("");
                        txtsolve1.setTextColor(Color.BLUE);
                        txtsolve2.setTextColor(Color.BLUE);
                    }

                } else {

                    double delta = Math.pow(b, 2) - 4 * a * c;
                    if (delta < 0) {
                        txtsolve1.setText("Phuong Trinh Vo Nghiem");
                        txtsolve2.setText("");
                        txtsolve1.setTextColor(Color.BLUE);
                        txtsolve2.setTextColor(Color.BLUE);
                    } else if (delta == 0) {
                        double kq = -b / 2 * a;
                        txtsolve1.setText("Phương Trình Có Nghiệm Kép: ");
                        txtsolve2.setText("x = " + kq);
                        txtsolve1.setTextColor(Color.BLUE);
                        txtsolve2.setTextColor(Color.BLUE);
                    } else {
                        double sqrtDelta = Math.sqrt(delta);
                        double kqX1 = (-b - sqrtDelta) / (2 * a);
                        double kqX2 = (-b + sqrtDelta) / (2 * a);
                        txtsolve1.setText("Nghiêm 1= " + kqX1);
                        txtsolve2.setText("Nghiệm 2= " + kqX2);
                        txtsolve1.setTextColor(Color.BLUE);
                        txtsolve2.setTextColor(Color.BLUE);
                    }
                }


            }
        });


    }
}
