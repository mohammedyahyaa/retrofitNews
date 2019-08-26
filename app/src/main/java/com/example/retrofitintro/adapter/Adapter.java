package com.example.retrofitintro.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.retrofitintro.R;
import com.example.retrofitintro.ShowDetails;
import com.example.retrofitintro.pojo.News_Response;


import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {




    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;


    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder myViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class myViewHolder extends RecyclerView.ViewHolder {



        @BindView(R.id.txt_news)
        TextView txt_news;

        @BindView(R.id.txt_date)
        TextView txt_date;

        @BindView(R.id.img_news)
        ImageView img_news;

        @BindView(R.id.relative_parent)
        RelativeLayout relative_parent;

        public myViewHolder(@NonNull View itemView, ShowDetails showDetails) {
            super(itemView);

            ButterKnife.bind(this, itemView);

        }


    }
}
