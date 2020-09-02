package com.oktavianyudha.myapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.oktavianyudha.myapp.R;

import java.util.ArrayList;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private static final String TAG = "MyAdapter";

    private ArrayList<String> mImage = new ArrayList<>();
    private ArrayList<Integer> mHeaders = new ArrayList<>();
    private ArrayList<Integer> mFooters = new ArrayList<>();
    private Context mContext;

    public MyAdapter(Context mContext, ArrayList<String> mImage, ArrayList<Integer> mHeaders, ArrayList<Integer> mFooters) {
        this.mImage = mImage;
        this.mHeaders = mHeaders;
        this.mFooters = mFooters;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.row_recycler, viewGroup ,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder,int i) {
        Log.d(TAG, "onBindViewHolder: called.");

       viewHolder.imagee.getId();
       viewHolder.textHeader.setText("Nama");
       viewHolder.textFooter.setText("Deskripsi");
    }

    @Override
    public int getItemCount() {
        return mImage.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
            ImageView imagee;
            TextView textHeader;
            TextView textFooter;
            RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagee = itemView.findViewById(R.id.image1);
            textHeader = itemView.findViewById(R.id.firstLine);
            textFooter = itemView.findViewById(R.id.secondLine);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}