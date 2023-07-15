package com.example.androidwebservices.okhttp
import okhttp3.OkHttpClient

val client = OkHttpClient.Builder()
    .addInterceptor(CustomInterceptor())
    .build()
