package com.example.a.lab2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Bai6 extends AppCompatActivity {
    EditText txte1;
    TextView txtsum;
    Button btn;
    int a, b;
    int test=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai6);
        txte1 = (EditText) findViewById(R.id.txtN);
        txte1.setHint("Input n");


        txtsum = (TextView) findViewById(R.id.txtSum);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txte1.getText().toString().equals("")) {
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


                } else {
                    try {
                        a = Integer.parseInt(txte1.getText().toString());
                    } catch (Exception e) {
                        Toast.makeText(Bai6.this, "Error", Toast.LENGTH_LONG).show();
                        test = 0;
                    }
                    if (test == 0) {
                        txtsum.setText("Error");
                        txtsum.setTextColor(Color.RED);
                    } else {
                        txtsum.setTextColor(Color.BLUE);
                        txtsum.setText("S= " + a * (a + 1) / 2);

                    }
                }
            }
        });

    }
}
