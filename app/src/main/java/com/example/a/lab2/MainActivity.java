package com.example.a.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listV = (ListView) findViewById(R.id.list);
        ArrayList<ClassListView> arrayList =new ArrayList<>();

        ClassListView a = new ClassListView("Tính Tổng");
        ClassListView b = new ClassListView("Giải Phương Trình Bậc 1");
        ClassListView c = new ClassListView("Giải Phương trình Bậc 2: ");
        ClassListView d=new ClassListView( "Max & & Min 3 Số" );
        ClassListView e=new ClassListView(" Số Nguyên Tố Nằm Giữa Hai Số ");
        ClassListView f=new ClassListView("S = 1+2+3+….+n");
        ClassListView g=new ClassListView("Ước Chung & Bội Chung");
        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);
        arrayList.add(d);
        arrayList.add(e);
        arrayList.add(f);
        arrayList.add(g);

        ArrayAdapter<ClassListView> arrayAdapter
                = new ArrayAdapter<ClassListView>(this, android.R.layout.simple_list_item_1 ,arrayList );
        listV.setAdapter(arrayAdapter);
        listV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                int index=i;
                if(i==0){//bai 1
                    Intent intent =new Intent(MainActivity.this,bai1.class);
                    startActivity(intent);
                }
                if(i==1){//bai 2
                    Intent intent =new Intent(MainActivity.this,bai2.class);
                    startActivity(intent);
                }
                if(i==2){//bai 3
                    Intent intent =new Intent(MainActivity.this,bai3.class);
                    startActivity(intent);
                }
                if(i==3){//bai 3
                    Intent intent =new Intent(MainActivity.this,bai4.class);
                    startActivity(intent);
                }
                if(i==4){
                    Intent intent =new Intent(MainActivity.this,bai5.class);
                    startActivity(intent);
                }
                if(i==5){
                    Intent intent =new Intent(MainActivity.this,Bai6.class);
                    startActivity(intent);
                }
                if(i==6){
                    Intent intent =new Intent(MainActivity.this,Bai7.class);
                    startActivity(intent);
                }
            }
        });

    }
}
