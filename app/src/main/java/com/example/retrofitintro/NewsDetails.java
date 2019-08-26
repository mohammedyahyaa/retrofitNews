package com.example.retrofitintro;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.retrofitintro.APIClient;
import com.example.retrofitintro.APIInterface;
import com.example.retrofitintro.R;
import com.example.retrofitintro.pojo.NewDetailsResponse;
import com.example.retrofitintro.pojo.NewsRequest;
import com.example.retrofitintro.pojo.News_Response;

import java.util.List;

import butterknife.ButterKnife;
import es.dmoral.toasty.Toasty;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewsDetails extends AppCompatActivity {

    APIInterface apiInterface;
    ProgressDialog progress;
    List<News_Response.Result> newsList;
    int id;
    TextView newsDetails_txt;
    TextView date_txt;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);

        Intent i = getIntent();
        id = i.getIntExtra("News_id", 0);

        apiInterface = APIClient.getClient().create(APIInterface.class);

        // Toast.makeText(this, "id="+id, Toast.LENGTH_SHORT).show();

        date_txt = findViewById(R.id.txt_date_details);
        newsDetails_txt = findViewById(R.id.txt_news_details);
        imageView = findViewById(R.id.img_poster_banner);


        getAllNews();
    }

    void getAllNews() {
        Call<NewDetailsResponse> call3 = apiInterface.getNewsById(id, 1);

        loader();

        call3.enqueue(new Callback<NewDetailsResponse>() {

            @Override
            public void onResponse(Call<NewDetailsResponse> call, Response<NewDetailsResponse> response) {
                NewDetailsResponse userList = response.body();

                //   newsList = (List<News_Response.Result>) userList.getData();


               // newsDetails_txt.setText(userList.getData().getDescrptionAr());
                newsDetails_txt.setText(Html.fromHtml(Html.fromHtml(userList.getData().getDescrptionAr()).toString()));
                date_txt.setText(userList.getData().getCreatedDate());



                Glide.with(imageView)
                        .load(userList.getData().getImage())
                        .apply(new RequestOptions()
                                .placeholder(R.drawable.ic_launcher_background).error(R.drawable.ic_launcher_background)
                        )
                        .into(imageView);


                if (userList.getMessage().equals("success")) {
                    progress.dismiss();
                }

            }


            @Override
            public void onFailure(Call<NewDetailsResponse> call, Throwable t) {
                call.cancel();
            }
        });


    }

    void loader() {

        progress = new ProgressDialog(this);
        progress.setTitle("Loading");
        progress.setMessage("Wait while loading...");
        progress.setCancelable(false); // disable dismiss by tapping outside of the dialog
        progress.show();
// To dismiss the dialog

    }

}
