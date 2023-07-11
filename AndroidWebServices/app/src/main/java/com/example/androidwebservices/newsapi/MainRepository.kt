package com.example.androidwebservices.newsapi

import com.example.androidwebservices.newsapi.network.NewsService

class MainRepository constructor(private val newsService: NewsService) {
      fun getNews() = newsService.getNews()
}
