package com.example.androidkotlin.Rocket

class RocketController() : RocketControllerInterface {
    override fun startRocketLaunch() {
        println("Status: ${RocketStatus.StartLaunching}")
        startIgnition()
    }

    override fun startIgnition() {
      rocketBoostersBurn()
    }

    override fun rocketBoostersBurn() {
        rocketLiftOff()
        println("Status: ${RocketStatus.Lifted}")
    }

    override fun rocketLiftOff() {
      heightTravel()
    }

    override fun heightTravel() {
     println()
    }
    override fun targetReach(reach: Boolean) {
        println("Rocket Status: ${RocketStatus.RocketLaunched}")
    }
}
