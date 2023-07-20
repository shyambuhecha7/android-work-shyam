package com.example.androidkotlin.update

fun main() {
    val rocket = RocketController2("Falcon 9",50,10.0, 5, 2000.0, RocketType.DELTA_IV_HEAVY)

    rocket.addFuel(1500.0)

    rocket.countdown()

    rocket.launch()

    val distanceAfter5Seconds = rocket.run {
        if (fuelLevel == 0.0) {
            return
        }
        var distance = distanceTraveled
        (1..5).forEach { _ ->

        }
        distance
    }
    println("Distance traveled after 5 seconds: $distanceAfter5Seconds km")
}