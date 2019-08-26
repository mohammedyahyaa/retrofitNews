package com.example.retrofitintro.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.retrofitintro.R;
import com.example.retrofitintro.ShowDetails;
import com.example.retrofitintro.pojo.News_Response;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.MyViewHolder> {


    Context context;
    List<News_Response.Result> models;
    private ShowDetails showDetails;

    public NewsAdapter(Context context) {
        this.context = context;


    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items_row_news, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(view,showDetails);
        return myViewHolder;
    }


    public NewsAdapter(Context context, List<News_Response.Result> resultEntitiesList,ShowDetails showDetails) {
        this.context = context;
        this.models = resultEntitiesList;
        this.showDetails=showDetails;
    }



    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        final News_Response.Result singleModel = models.get(position);

            holder.txt_news.setText(singleModel.getTitleAr());
            holder.txt_date.setText(parcDatee(singleModel.getCreatedDate()));


        String origianlUrl =  models.get(position).getImage();



        Glide.with(context)
                .load(origianlUrl)
                .apply(new RequestOptions()
                        .placeholder(R.drawable.ic_launcher_background).error(R.drawable.ic_launcher_background)
                )
                .into(holder.img_news);



    }


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ShowDetails showDetails;
        @BindView(R.id.txt_news)
        TextView txt_news;

        @BindView(R.id.txt_date)
        TextView txt_date;

        @BindView(R.id.img_news)
        ImageView img_news;

        @BindView(R.id.relative_parent)
        RelativeLayout relative_parent;


        public MyViewHolder(View itemView,ShowDetails showDetails) {
            super(itemView);
            itemView.setOnClickListener(this);
            this.showDetails = showDetails;
            ButterKnife.bind(this, itemView);
        }

        @Override
        public void onClick(View v) {
            showDetails.onClick(models.get(getAdapterPosition()).getID());
        }
    }

    @Override
    public int getItemCount() {
        return models == null ? 0 : models.size();
    }

    public static String parcDatee(String databaseDate) {
        SimpleDateFormat input = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm", Locale.ENGLISH);
        SimpleDateFormat output = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        Date d = null;
        try {
            d = input.parse(databaseDate);
            return output.format(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }
}