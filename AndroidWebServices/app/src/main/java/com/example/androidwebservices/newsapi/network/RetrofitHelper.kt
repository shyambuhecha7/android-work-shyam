package com.example.androidwebservices.newsapi.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.create

const val baseUrl = "https://newsapi.org/"

val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(baseUrl)
    .build()
    .create(NewsService::class.java)
