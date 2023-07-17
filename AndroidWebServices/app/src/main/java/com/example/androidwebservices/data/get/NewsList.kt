package com.example.androidwebservices.data.get

data class NewsList(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)