package com.example.androidkotlin.rocketdemo

object RocketController {
    fun launch() {
        println("Rocket launched!")
    }

    fun connectWith(missionControl: MissionControl) {
        println("Connect with ${missionControl.nameOfMissionControllerOrganization}...")
        println("Connection successful!")
    }
}