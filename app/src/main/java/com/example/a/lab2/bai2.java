package com.example.a.lab2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bai2 extends AppCompatActivity {
    double a=0;
    double b=0;
    double x;
    int test = 1;
    EditText txte1;
    EditText txte2;
    TextView txtsolve;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        txte1 = (EditText) findViewById(R.id.txta);
        txte2 = (EditText) findViewById(R.id.txtb);
        txte1.setHint("Input a");
        txte2.setHint("Input b");
        txtsolve = (TextView) findViewById(R.id.txtS);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Double.parseDouble(txte1.getText().toString());
                b = Double.parseDouble(txte2.getText().toString());
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
                        txtsolve.setTextColor(Color.BLUE);
                        if (a == 0) {
                            if (b == 0) {
                                txtsolve.setText("phuong trinh vo so nghiem");
                            } else {
                                txtsolve.setText("phuong trinh vo nghiem");
                            }
                        } else {
                            x = -b / a;
                            txtsolve.setText("nghiem cua phuong trinh la" + x);
                        }


            }
        });


    }
}

