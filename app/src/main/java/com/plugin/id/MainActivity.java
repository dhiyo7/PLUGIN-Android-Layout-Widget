package com.plugin.id;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn1, btn2 ,btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.buttonclick);
        btn1.setOnClickListener(this);
        btn2 = findViewById(R.id.image);
        btn2.setOnClickListener(this);
        btn3 = findViewById(R.id.linear);
        btn3.setOnClickListener(this);
        btn4 = findViewById(R.id.relative);
        btn4.setOnClickListener(this);
        btn5 = findViewById(R.id.scrollview);
        btn5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
