package com.example.androidwebservices.newsapi.model

data class NewsList(
    val articles: ArrayList<Article>,
    val status: String,
    val totalResults: Int
)