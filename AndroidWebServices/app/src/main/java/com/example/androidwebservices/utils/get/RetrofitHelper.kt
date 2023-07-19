package com.example.androidwebservices.utils.get

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val baseUrl = "https://newsapi.org/"

val retrofit: NewsService = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(baseUrl)
    .build()
    .create(NewsService::class.java)
