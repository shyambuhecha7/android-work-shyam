package com.example.androidkotlin.rocketdemo

open class RocketController {
    fun launch() {
        println("Rocket launched!")

        (1..5).forEach { _ ->
            Thread.sleep(700)
            print(". ")
        }
    }

    fun connectWith(missionControl: MissionController) {
        println("Connect with ${missionControl}...")
        println("Connection successful!")
    }

}