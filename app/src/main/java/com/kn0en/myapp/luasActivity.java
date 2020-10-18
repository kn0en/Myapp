package com.kn0en.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class luasActivity extends AppCompatActivity {

    private EditText edt_panjang, edt_lebar;
    private TextView tx_luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas);

        edt_panjang = findViewById(R.id.edt_panjang);
        edt_lebar = findViewById(R.id.edt_lebar);
        tx_luas = findViewById(R.id.tx_luas);
        Button bt_hitung = findViewById(R.id.bt_hitung);

        bt_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float panjang = Float.parseFloat(edt_panjang.getText().toString());
                Float lebar = Float.parseFloat(edt_lebar.getText().toString());
                float luas = panjang * lebar;

                tx_luas.setText(Float.toString(luas));
            }
        });


    }
}
