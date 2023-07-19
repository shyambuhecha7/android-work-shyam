package com.example.androidwebservices.utils.post

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val baseUrl = "https://reqres.in/api/"

val retrofit: Retrofit =
    Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create()).build()

val postApiService: PostApiService = retrofit.create(PostApiService::class.java)

