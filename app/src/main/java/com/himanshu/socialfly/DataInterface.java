package com.himanshu.socialfly;

import com.himanshu.socialfly.POJO.RequestBody;
import com.himanshu.socialfly.POJO.Seat;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface DataInterface {
    @POST("/seats/")
    Call<ArrayList<Seat>> getSeats(@Body RequestBody requestBody);
}
