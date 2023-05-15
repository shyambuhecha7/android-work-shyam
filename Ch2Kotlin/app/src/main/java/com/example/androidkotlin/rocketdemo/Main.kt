package com.example.androidkotlin.rocketdemo

class Main
fun main() {
    val rocketController = RocketController()
    val astronaut = Astronaut("Shyam")
    val missionController= MissionController("ISRO")

    val rocket = Rocket(rocketController, astronaut, missionController)
    rocket.missionController.startMission(50.0F){
        astronaut.performTask(Task.PrepareForLaunch)
    }
}