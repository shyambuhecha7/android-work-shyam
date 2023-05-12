package com.example.androidkotlin.rocketdemo

import javax.security.auth.callback.Callback

class Astronaut(val name: String) {
    fun performTask(task: Task) {
        when (task) {
            is Task.PrepareForLaunch -> println("$name is preparing for launch")
            is Task.ExecuteMission -> println("$name is executing the mission")
            is Task.ReturnToEarth -> println("$name is returning to Earth")
        }
    }

    fun receiveData(data: String, callback: (String)-> Unit) {
        callback(data)
    }
}