package com.example.androidkotlin.rocket.update

class Main

fun main() {
    val rocket = LaunchSatellite("Falcon 9",10, 2000.0, 2000.0, RocketType.FALCON_9)
    rocket.addFuel(1000.0)

    rocket.countdown()

    rocket.launch()

    val distanceAfter5Seconds = rocket.run {
        var distance = distanceTraveled
        (1..5).forEach {
            val fuelConsumed = rocketType.fuelConsumptionRate * timeInSpace
            fuelLevel -= fuelConsumed
            if (fuelLevel < 0.0) {
                fuelLevel = 0.0
            }
            println("fuelConsumed : $fuelConsumed")

            distance += 7.8 * timeInSpace
            timeInSpace += 1.0
            println("Travel Distance : $distance")
        }
        distance
    }

    println("Distance traveled after 5 seconds: $distanceAfter5Seconds km")
}