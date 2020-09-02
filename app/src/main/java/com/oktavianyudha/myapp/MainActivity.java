package com.oktavianyudha.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button btn_luas;
private Button btn_kalkulator;
private Button btn_browser;
private Button btn_recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_browser = findViewById(R.id.btn_browser);
        btn_kalkulator = findViewById(R.id.btn_kal);
        btn_luas = findViewById(R.id.btn_luas);
        btn_recycler = findViewById(R.id.btn_recycler);

        btn_browser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), browserActivity.class);
                startActivity(i);
            }
        });

        btn_recycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), recyclerActivity.class);
                startActivity(i);
            }
        });

        btn_luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), luasActivity.class);
                startActivity(i);
            }
        });

        btn_kalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), kalkulatorActivity.class);
                startActivity(i);
            }
        });


    }
}
