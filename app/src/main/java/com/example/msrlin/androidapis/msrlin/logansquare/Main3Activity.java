package com.example.msrlin.androidapis.msrlin.logansquare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.msrlin.androidapis.R;

public class Main3Activity extends AppCompatActivity {

    private Button button1;//解析
    private Button button2;//序列化
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);

    }



}
