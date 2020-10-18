package com.kn0en.myapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kn0en.myapp.adapter.MyAdapter;

import java.util.ArrayList;

public class recyclerActivity extends AppCompatActivity {

    private ArrayList<String> mImages = new ArrayList<>();
    private ArrayList<Integer> mHeader = new ArrayList<>();
    private ArrayList<Integer> mFooter = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        initJob();
    }

    private void initJob() {
        for (int i = 0; i < 50; i++) {
            mImages.add(String.valueOf(R.id.image1));
            mHeader.add(R.id.firstLine);
            mFooter.add(R.id.secondLine);
        }
        initRecyclerview();
    }

    private void initRecyclerview() {
        RecyclerView rv = findViewById(R.id.my_recycler_view);
        MyAdapter adapter = new MyAdapter(this, mImages, mHeader, mFooter);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}