package com.example.androidwebservices.newsapi.network.get

import com.example.androidwebservices.newsapi.model.get.NewsList
import retrofit2.Response
import retrofit2.http.GET

interface NewsService {
    @GET("v2/everything?q=tesla&from=2023-06-13&sortBy=publishedAt&apiKey=c5a974d6ae66438b8d8ea823cfa26549")
    suspend fun getNews() : Response<NewsList>

    @GET("v2/top-headlines?country=us&category=business&apiKey=c5a974d6ae66438b8d8ea823cfa26549")
    fun getNewsTopHeadline(): Response<NewsList>

}