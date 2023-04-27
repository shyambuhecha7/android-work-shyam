package com.example.androidkotlin.Rocket.SateliteLaunch
import com.example.androidkotlin.Rocket.RocketStatus

class LaunchSatelliteImpl() : LaunchSatellite {
    var distanceInSpace: Long = 0

    fun travelDistance(distanceInSpace: Long) {
        println("Travel Distance: $distanceInSpace")
    }

    override fun thrustRocket() {
        travelDistance(0)
        println("Launching.....")
        rocketPowerAscent()
    }

    override fun rocketPowerAscent() {
        travelDistance(5)
        println("Burn fuel...")
        rocketStaging()
    }

    override fun rocketStaging() {
        travelDistance(50)
        println("release Body Tube... ")
        rocketUpperStageBurn()
    }

    override fun rocketUpperStageBurn() {
        travelDistance(70)
        println("Nozzle Burn... ")
        engineCutOut()
    }

    override fun engineCutOut() {
        travelDistance(100)
        println("release Engine...")
        println("Status: ${RocketStatus.SatelliteLaunched}")

    }
}
