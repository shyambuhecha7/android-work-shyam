package com.example.feb_17_android_task_1

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var change_text: Button
    lateinit var go_to: Button
    lateinit var txt : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        change_text = findViewById(R.id.btn_click)
        go_to = findViewById(R.id.go_to)

        txt = findViewById(R.id.txt)

        //button click and chance existing text of textview to "Task completed.." and change to Green color
        change_text.setOnClickListener{
            txt.text = "Task completed.."
            txt.setTextColor(Color.GREEN)
        }

        //button click and goto secondactivity using intent
        go_to.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }







    }
}