package com.example.androidwebservices.newsapi.network

import com.example.androidwebservices.newsapi.model.Article
import com.example.androidwebservices.newsapi.model.NewsList
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface NewsService {
    @GET("top-headlines?sources=techcrunch&apiKey=c5a974d6ae66438b8d8ea823cfa26549")
   fun getNews() : Call<ArrayList<Article>>
}