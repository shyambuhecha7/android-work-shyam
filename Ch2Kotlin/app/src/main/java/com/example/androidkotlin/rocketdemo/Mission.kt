package com.example.androidkotlin.rocketdemo

interface Mission {
    fun startMission(massOfRocket: Float, callBack: () -> Unit)

    fun rocketThrusting(force: Int)

    fun completeMission(callBack: () -> Unit)

}