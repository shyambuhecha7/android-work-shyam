package com.example.androidwebservices.utils.post

import com.example.androidwebservices.datas.post.PostRequestModel
import com.example.androidwebservices.datas.post.PostResponseModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface PostApiService {
    @POST("register")
    suspend fun register(@Body registerRequestModel: PostRequestModel) : Response<PostResponseModel>
}