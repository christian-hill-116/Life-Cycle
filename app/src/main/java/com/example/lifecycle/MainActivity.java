package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_clicker;
    TextView tv_counter;

    int clicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_clicker = findViewById(R.id.btn_clicker);
        tv_counter = findViewById(R.id.tv_counter);

        btn_clicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicks++;
                tv_counter.setText(Integer.toString(clicks));
            }
        });

    }
}