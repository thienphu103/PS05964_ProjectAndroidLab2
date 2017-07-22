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

public class bai4 extends AppCompatActivity {
    double a = 0, b = 0, c = 0, d = 0;
    double max, min;
    int test = 1;
    EditText txte1;
    EditText txte2;
    EditText txte3;
    TextView txtsolvemax;
    TextView txtsolvemin;
    Button btn_max_min;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);
        txte1 = (EditText) findViewById(R.id.txta2);
        txte2 = (EditText) findViewById(R.id.txtb2);
        txte3 = (EditText) findViewById(R.id.txtc2);
        txtsolvemax = (TextView) findViewById(R.id.txtMaxS);
        txtsolvemin = (TextView) findViewById(R.id.txtMinS);
        txte1.setHint("Input a");
        txte2.setHint("Input b");
        txte3.setHint("Input c");

        btn_max_min = (Button) findViewById(R.id.btnMax_Min);
        btn_max_min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txte1.getText().toString().equals("") || txte2.getText().toString().equals("") || txte3.getText().toString().equals("")) {
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

                } else {
                    try {
                        a = Double.parseDouble(txte1.getText().toString());
                        b = Double.parseDouble(txte2.getText().toString());
                        c = Double.parseDouble(txte3.getText().toString());

                    } catch (Exception e) {
                        Toast.makeText(bai4.this, "Error", Toast.LENGTH_LONG).show();
                        test = 0;
                    }
                    if (test == 0) {
                        txtsolvemax.setText("Error");
                        txtsolvemin.setText("");
                        txtsolvemin.setTextColor(Color.RED);
                    } else {
                        min = max = a;

                        if (b > max) {

                            max = b;
                        }
                        if (c > max) {

                            max = c;
                        }
                        if (b < min) {

                            min = b;
                        }
                        if (c < min) {

                            min = c;
                        }
                        txtsolvemax.setText("Max: " + max);
                        txtsolvemin.setText("Min: " + min);
                        txtsolvemin.setTextColor(Color.BLUE);
                        txtsolvemax.setTextColor(Color.BLUE);

                    }


                }
            }

        });
    }
}


