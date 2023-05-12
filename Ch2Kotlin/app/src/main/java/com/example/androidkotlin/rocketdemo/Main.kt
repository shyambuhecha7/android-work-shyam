package com.example.androidkotlin.rocketdemo

fun main() {
    val astronaut = Astronaut("Shyam")
    val mission = RocketLaunchMission(0.7)
    val rocket = Rocket(RocketController, astronaut)
    val missionController = MissionControl("ISRO")

    rocket.connectWith(missionController)

    val isMissionSuccessful = rocket.startMission(mission)
    if (isMissionSuccessful) {
        println("Mission was successful!")
    } else {
        println("Mission failed.")
    }
}