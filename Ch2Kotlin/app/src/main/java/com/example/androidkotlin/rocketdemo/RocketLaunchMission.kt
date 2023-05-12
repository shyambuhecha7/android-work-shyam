package com.example.androidkotlin.rocketdemo

class RocketLaunchMission(private val successRate: Double) : Mission {
    override fun completeMission(): Boolean {
        println("Mission complete!")
        return Math.random() < successRate
    }
}