package com.example.androidkotlin.rocket.update

open class LaunchSatellite(
    name: String,
    countdownTime: Int,
    targetDistance: Double,
    fuelCapacity: Double,
    rocketType: RocketType
) : Rocket(name, 0.0, fuelCapacity, countdownTime, targetDistance, rocketType), RocketControllerInterface {

    override fun igniteEngine() {
        println("Igniting engines for $name.")
        isEngineIgnited = true
    }

    override fun shutdownEngine() {
        println("Shutting down engines for $name.")
        isEngineIgnited = false
    }

    override fun deploySatellite() {
        println("Deploying satellite from $name.")
    }
}