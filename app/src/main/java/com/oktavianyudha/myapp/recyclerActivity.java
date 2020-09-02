package com.oktavianyudha.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.oktavianyudha.myapp.adapter.MyAdapter;

import java.util.ArrayList;

public class recyclerActivity extends AppCompatActivity {

    private ArrayList<String> mImages = new ArrayList<>();
    private ArrayList<Integer> mHeader = new ArrayList<Integer>();
    private ArrayList<Integer> mFooter = new ArrayList<Integer>();

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
        RecyclerView rv = (RecyclerView) findViewById(R.id.my_recycler_view);
        MyAdapter adapter = new MyAdapter(this, mImages, mHeader, mFooter);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}