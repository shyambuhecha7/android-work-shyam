package com.example.onecloudandroid.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)

        splashScreen.setKeepOnScreenCondition { true }
        startSomeNextActivity()
        finish()
    }
    private fun startSomeNextActivity() {

        val sharedPreference =  getSharedPreferences("loginData", Context.MODE_PRIVATE)

        if(sharedPreference.getString("emailData","Guest") != "Guest") {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }else{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}