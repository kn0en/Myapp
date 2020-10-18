package com.kn0en.myapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class browserActivity extends AppCompatActivity {

    private Button btn_url;
    private EditText edt_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        btn_url = findViewById(R.id.btn_url);
        edt_url = findViewById(R.id.edt_url);

        btn_url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = ("http://" + edt_url.getText().toString());
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                startActivity(i);
            }
        });
    }
}
