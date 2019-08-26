package com.example.retrofitintro;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.retrofitintro.adapter.NewsAdapter;
import com.example.retrofitintro.pojo.NewsRequest;
import com.example.retrofitintro.pojo.News_Response;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity implements ShowDetails {


    APIInterface apiInterface;

    @BindView(R.id.news_rv)
    RecyclerView news_rv;

    NewsAdapter newsAdapter2;
    List<News_Response.Result> newsList;
    ProgressDialog progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        apiInterface = APIClient.getClient().create(APIInterface.class);


        getAllNews();
    }


    void getAllNews() {
        Call<News_Response> call3 = apiInterface.getAllNews(new NewsRequest(1, 7, 1));

        loader();

        call3.enqueue(new Callback<News_Response>() {

            @Override
            public void onResponse(Call<News_Response> call, Response<News_Response> response) {
                News_Response userList = response.body();

                newsList = userList.getData();
                initRecyclerView();

                if (userList.getMessage().equals("success")) {
                    progress.dismiss();
                }

            }


            @Override
            public void onFailure(Call<News_Response> call, Throwable t) {
                call.cancel();
            }
        });


    }


    private void initRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        news_rv.setLayoutManager(linearLayoutManager);
        news_rv.setItemAnimator(new DefaultItemAnimator());
        news_rv.setNestedScrollingEnabled(false);
        news_rv.setHasFixedSize(true);
        news_rv.scrollToPosition(0);
        newsAdapter2 = new NewsAdapter(this, newsList,this);
        news_rv.setAdapter(newsAdapter2);
    }


    void loader() {

        progress = new ProgressDialog(this);
        progress.setTitle("Loading");
        progress.setMessage("Wait while loading...");
        progress.setCancelable(false); // disable dismiss by tapping outside of the dialog
        progress.show();
// To dismiss the dialog

    }



    @Override
    public void onClick(int postion) {
        Intent i = new Intent(this, NewsDetails.class);
        i.putExtra("News_id", postion);
        startActivity(i);
    }



}



