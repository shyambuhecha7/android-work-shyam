package com.example.androidwebservices.newsapi.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.androidwebservices.newsapi.MainRepository
import com.example.androidwebservices.newsapi.model.Article
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel(val repository: MainRepository) : ViewModel() {

    private val articleList = MutableLiveData<ArrayList<Article>>()
    val errorMessage = MutableLiveData<String>()



    val liveArticleList: LiveData<ArrayList<Article>>
        get() = articleList


    fun getNews() {
        val response = repository.getNews()
//        val res = RetrofitHelper.getRetrofitInstance()
//        val response = res.create(NewsService::class.java)
        response.enqueue(object : Callback<ArrayList<Article>> {
            override fun onResponse(
                call: Call<ArrayList<Article>>,
                response: Response<ArrayList<Article>>
            ) {
                articleList.postValue(response.body())
            }

            override fun onFailure(call: Call<ArrayList<Article>>, t: Throwable) {
                errorMessage.postValue(t.message)
            }

        })


    }

}