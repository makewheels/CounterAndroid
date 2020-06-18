package com.androiddeveloper.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_number;
    private Button btn_sub;
    private Button btn_add;
    private Button btn_clear;

    private int currentNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        addListeners();

    }

    private void initView() {
        tv_number = findViewById(R.id.tv_number);
        btn_sub = findViewById(R.id.btn_sub);
        btn_add = findViewById(R.id.btn_add);
        btn_clear = findViewById(R.id.btn_clear);
    }

    private void addListeners() {
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNumber--;
                tv_number.setText(currentNumber + "");
            }
        });
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNumber++;
                tv_number.setText(currentNumber + "");
            }
        });
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNumber=0;
                tv_number.setText(currentNumber + "");
            }
        });
    }
}