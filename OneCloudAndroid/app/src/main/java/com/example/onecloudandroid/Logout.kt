package com.example.onecloudandroid

import android.app.StatusBarManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.databinding.DataBindingUtil
import com.example.onecloudandroid.databinding.ActivityLogoutBinding

class Logout : AppCompatActivity() {
    lateinit var binding : ActivityLogoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_logout)
        setContentView(binding.root)

        val sharedPreference =  getSharedPreferences("loginData", Context.MODE_PRIVATE)
        var editor = sharedPreference.edit()

        binding.tvEmail.text = sharedPreference.getString("emailData","Guest")
        var userName = binding.tvEmail.text.removeSuffix("@gmail.com").toString()
        userName = "@$userName"
        binding.profileName.text = userName

        binding.item1.title = "Status"
        binding.item1.description = "Available"

        binding.item2.title = "Status Message"
        binding.item2.description = "The unseen of spending three years at Pixelgra"

        binding.item3.title = "Meeting ID"
        binding.item3.description = "Generate Automatically"

        binding.item4.title = "Person Info"

        binding.item5.title = "Help"

    }
}