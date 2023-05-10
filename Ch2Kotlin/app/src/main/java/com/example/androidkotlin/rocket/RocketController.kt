package com.example.androidkotlin.rocket

class RocketController(rocket: Rocket) {
    fun igniteEngines() {
        println("Rocket controller: igniting engines...")

        repeat(3) { i ->
            Thread.sleep(500)
            print(".")
        }
        println("\nRocket engines have been ignited!")
    }
}