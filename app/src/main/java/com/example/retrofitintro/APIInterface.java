package com.example.retrofitintro;



import com.example.retrofitintro.pojo.NewDetailsResponse;
import com.example.retrofitintro.pojo.NewsRequest;
import com.example.retrofitintro.pojo.News_Response;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by anupamchugh on 09/01/17.
 */

interface APIInterface {

    @POST("api/News/GetALLNews")
    Call<News_Response> getAllNews(@Body NewsRequest newsRequest);

    @POST("api/News/GetNewsById")
    Call<NewDetailsResponse> getNewsById(@Query("NewsID") Integer newsId ,
                                         @Query("Lang") Integer lang);
}
