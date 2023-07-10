package com.example.androidwebservices.network
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MarsViewModel: ViewModel() {
    fun getMarsPhotos() {
      viewModelScope.launch{}
    }
}