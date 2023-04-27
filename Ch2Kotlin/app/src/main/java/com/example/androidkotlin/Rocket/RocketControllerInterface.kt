package com.example.androidkotlin.Rocket

interface RocketControllerInterface {
    fun startRocketLaunch()
    fun targetReach(reach: Boolean)
    fun startIgnition()
    fun rocketBoostersBurn()
    fun rocketLiftOff()
    fun heightTravel()
}
