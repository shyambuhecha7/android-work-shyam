package com.example.androidwebservices.okhttp
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


val baseURL = "https://newsapi.org/"

//MARK:USING INTERCEPTOR - MODIFIED REQUEST
val retrofit = Retrofit.Builder()
    .baseUrl(baseURL)
    .client(client)
    .addConverterFactory(GsonConverterFactory.create())
    .build()





