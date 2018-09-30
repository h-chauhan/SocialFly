package com.himanshu.socialfly;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroClass {
    static Retrofit.Builder builder = new Retrofit.Builder().baseUrl("https://7781adde.ngrok.io/")
            .addConverterFactory(GsonConverterFactory.create());
    static Retrofit retrofit = builder.build();
    public static DataInterface client = retrofit.create(DataInterface.class);
}
