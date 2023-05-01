package com.example.androidkotlin.rocket.rocketlaunch


enum class RocketStatus {
    Nothing,
    StartLaunching,
    Lifted,
    SpeedMode,
    SupperMode,
    RocketLaunched,
    SatelliteLaunched
    ;
    fun rocketStatus(status: RocketStatus) {
        println("Rocket Status: $status")
    }

}