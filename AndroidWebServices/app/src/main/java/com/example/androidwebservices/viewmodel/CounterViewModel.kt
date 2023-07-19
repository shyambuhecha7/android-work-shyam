package com.example.androidwebservices.viewmodel

import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {

    var count = 0

    fun add() {
        count++
    }
}