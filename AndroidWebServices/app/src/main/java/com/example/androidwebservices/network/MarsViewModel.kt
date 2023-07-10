package com.example.androidwebservices.network
import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.math.log

class MarsViewModel: ViewModel() {

    val
    fun getMarsPhotos() {
      viewModelScope.launch{
          val listResult = MarsApi.retrofitService.getPhotos()


      }
    }
}