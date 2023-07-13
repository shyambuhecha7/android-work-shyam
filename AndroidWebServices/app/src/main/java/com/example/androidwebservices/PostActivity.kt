package com.example.androidwebservices

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.example.androidwebservices.databinding.ActivityPostBinding
import com.example.androidwebservices.newsapi.model.post.PostRequestModel
import com.example.androidwebservices.newsapi.network.post.postApiService
import kotlinx.coroutines.launch

class PostActivity : AppCompatActivity() {
    lateinit var binding: ActivityPostBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_post)
        lifecycleScope.launch {
            val registerRequestModel = PostRequestModel(
                binding.emailEditText.text.toString(),
                binding.passwordEditText.text.toString()
            )
            val response = postApiService.register(registerRequestModel)

            binding.submitButton.setOnClickListener {
                try {
                    if (response.isSuccessful) {
                        var registerResponse = response.body()
                        binding.tvId.text = "id: " + registerResponse?.id.toString()
                        binding.tvToken.text = "Token: " +  registerResponse?.token.toString()
                        Toast.makeText(this@PostActivity,"Response successfully return",Toast.LENGTH_LONG).show()
                    } else {
                        val errorBody = response.errorBody()
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
    }
}