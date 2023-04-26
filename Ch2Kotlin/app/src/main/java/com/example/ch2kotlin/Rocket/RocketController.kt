package com.example.ch2kotlin.Rocket

class RocketController() : RocketControllerInterface {
    override fun hasLaunch(launch: Launch) {
        println("Status: ${RocketStatus.Lanched}")
        println(" ignition: ${launch.ignition},\n boostersBurn: ${launch.boosterBurn},\n liftOff: ${launch.liftOff},\n heightTravel: ${launch.hightTravell}")
    }

    override fun hasSuperMode() {
        println("mode: ${RocketStatus.SpeedMode}")
    }

    override fun targetReach(reach: Boolean) {
        println("Reach: $reach")
    }
}
