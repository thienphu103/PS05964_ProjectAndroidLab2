package com.example.a.lab2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.a.lab2.R.id.txt2;

public class bai1 extends AppCompatActivity {
    EditText txte1;
    EditText txte2;
    TextView txtsum;
    Button btn;
    int a, b;
    int test=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        txte1 = (EditText) findViewById(R.id.txt1);
        txte2 = (EditText) findViewById(txt2);
        txte1.setHint("Input a");
        txte2.setHint("Input b");

        txtsum = (TextView) findViewById(R.id.txtSum);
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
                                return false;
                            }
                        });
                    }
                        txtsum.setTextColor(Color.BLUE);
                        txtsum.setText(a + "" + "+" + b + "=" + (a + b));

                    }
        });

    }
}
