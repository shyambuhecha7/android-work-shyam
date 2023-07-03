package com.example.onecloudandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)

        splashScreen.setKeepOnScreenCondition { true }
        startSomeNextActivity()
        finish()
    }

    private fun startSomeNextActivity() {
        val intent = Intent(this,HomeActivity::class.java)
        startActivity(intent)

    }

}