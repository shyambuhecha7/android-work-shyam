package com.example.androidwebservices.datas.get

data class NewsList(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)