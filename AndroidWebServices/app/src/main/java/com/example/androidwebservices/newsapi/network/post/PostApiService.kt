package com.example.androidwebservices.newsapi.network.post

import com.example.androidwebservices.newsapi.model.post.PostRequestModel
import com.example.androidwebservices.newsapi.model.post.PostResponseModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface PostApiService {
    @POST("register")
    suspend fun register(@Body registerRequestModel: PostRequestModel) : Response<PostResponseModel>
}