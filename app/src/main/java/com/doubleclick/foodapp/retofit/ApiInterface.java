package com.doubleclick.foodapp.retofit;

import com.doubleclick.foodapp.model.FoodData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("fooddata.json")
    Call<List<FoodData>> getAllData();


    // lets make our model class of json data.
}
