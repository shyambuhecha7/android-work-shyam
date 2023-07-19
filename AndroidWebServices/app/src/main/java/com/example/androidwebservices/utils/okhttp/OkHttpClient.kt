package com.example.androidwebservices.utils.okhttp
import okhttp3.OkHttpClient

val client = OkHttpClient.Builder()
    .addInterceptor(CustomInterceptor())
    .build()
