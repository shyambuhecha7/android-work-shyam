package com.example.androidwebservices.marsnetwork

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET


private const val BASE_URL = "https://newsapi.org/v2/top-headlines?sources=techcrunch&apiKey=c5a974d6ae66438b8d8ea823cfa26549"

private val retrofit =
    Retrofit.Builder()
        .addConverterFactory(ScalarsConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

interface MarsApiService {
    @GET("photos")
   suspend fun getPhotos(): String
}

object MarsApi {
    val retrofitService: MarsApiService by lazy {
        retrofit.create(MarsApiService::class.java)
    }
}