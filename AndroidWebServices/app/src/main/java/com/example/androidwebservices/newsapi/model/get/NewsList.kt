package com.example.androidwebservices.newsapi.model.get

import com.example.androidwebservices.newsapi.model.get.Article

data class NewsList(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)