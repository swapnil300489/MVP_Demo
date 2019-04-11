package com.retrofit;



import com.global.Config;

import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {

    String BASE_URL = Config.serverURL;


    HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

    Retrofit retrofitRider = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    public APIInterface getConnection(){

        APIInterface connection = retrofitRider.create(APIInterface.class);

        return connection;

    }

}
