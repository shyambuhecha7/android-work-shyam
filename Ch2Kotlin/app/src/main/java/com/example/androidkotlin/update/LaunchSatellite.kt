package com.example.androidkotlin.update

open class LaunchSatellite(
    name: String,
    velocity: Int,
    countdownTime: Int,
    targetDistance: Double,
    fuelCapacity: Double,
    rocketType: RocketType
): Rocket(name, velocity , fuelCapacity, countdownTime, targetDistance, rocketType)