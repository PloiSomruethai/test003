package com.example.test003

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("albums/3/photos")
    fun getPhotos(): Call<List<DataModel>>

}