package com.example.androidwebservices.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.androidwebservices.R
import com.example.androidwebservices.databinding.ActivityCounterBinding
import com.example.androidwebservices.mvvm.viewmodel.CounterViewModel

class CounterActivity : AppCompatActivity() {
    lateinit var binding : ActivityCounterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_counter)

        var viewModel: CounterViewModel = ViewModelProvider(this).get(CounterViewModel::class.java)

        binding.tv.text = viewModel.count.toString()

        binding.add.setOnClickListener {
            viewModel.add()
            binding.tv.text = viewModel.count.toString()
        }
    }
}