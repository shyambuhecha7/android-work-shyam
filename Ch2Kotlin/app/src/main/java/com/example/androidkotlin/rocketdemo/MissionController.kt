package com.example.androidkotlin.rocketdemo

import kotlin.random.Random

open class MissionController(nameOfMissionControllerOrganization: String) : Mission,
    RocketController() {
    private var force: Float = 0.0f

    override fun startMission(massOfRocket: Float, callBack: () -> Unit) {
        println("Start Mission...")
        callBack()

        force = massOfRocket * (9.8).toInt() //gravity

        rocketThrusting((0..1000).random())

    }

    override fun rocketThrusting(force: Int) {
        when {
            this.force < force -> {
                println("start rocket thrusting...")
                launch()

                println()
                completeMission { Astronaut("Shyam").performTask(Task.ReturnToEarth) }

                for (i in 1..5) {
                    Thread.sleep(1000)
                    print("...")
                }
            }
            else -> {
                println("Rocket Not Launch need force more than ${this.force}N ")
            }
        }
    }

    override fun completeMission(callBack: () -> Unit) {
        callBack()
        println("Mission Completed..")
    }

}