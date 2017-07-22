package com.example.a.lab2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bai7 extends AppCompatActivity {
    EditText txte1;
    EditText txte2;
    TextView txtsum;
    Button btn;
    int a, b;
    int c = 0;
    int test = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai7);
        txte1 = (EditText) findViewById(R.id.txt1N);
        txte2 = (EditText) findViewById(R.id.txt2N);
        txte1.setHint("Input a");
        txte2.setHint("Input b");


        txtsum = (TextView) findViewById(R.id.txtN);
        btn = (Button) findViewById(R.id.button);
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


                txtsum.setText("UCLN (a,b) la: " + ucln(a, b) + " \n" + "BCNN (a,b) la: " + bcnn(a, b));

            }


        });

    }

    public int ucln(int a, int b) {
        return (b == 0) ? a : ucln(b, a % b);
    }

    public int bcnn(int a, int b) {
        return (a * b) / ucln(a, b);
    }
}
