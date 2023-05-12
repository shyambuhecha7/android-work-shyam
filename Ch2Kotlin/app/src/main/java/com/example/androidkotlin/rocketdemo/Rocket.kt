package com.example.androidkotlin.rocketdemo

class Rocket(private val rocketController: RocketController, private val astronaut: Astronaut) {
    fun startMission(mission: Mission): Boolean {
        astronaut.performTask(Task.PrepareForLaunch)
        rocketController.launch()
        astronaut.performTask(Task.ExecuteMission)
        val isMissionSuccessful = mission.completeMission()
        astronaut.performTask(Task.ReturnToEarth)
        return isMissionSuccessful
    }
    fun connectWith(missionControl: MissionControl) {
        rocketController.connectWith(missionControl)
    }
}