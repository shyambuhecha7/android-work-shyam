package com.example.androidkotlin.rocket.satelitelaunch

import com.example.androidkotlin.rocket.fueltank.FuelTankController
import com.example.androidkotlin.rocket.rocketlaunch.RocketStatus

class LaunchSatelliteImpl : LaunchSatellite, FuelTankController() {

    private fun travelDistance(distanceInSpace: Long) {
        println("Travel Distance: $distanceInSpace")
    }

    override fun thrustRocket() {
        fuelTankCapacity = 100
        travelDistance(0)
        println("Launching.....")
        rocketPowerAscent()
    }

    override fun rocketPowerAscent() {
        fuelTankCapacity = 70
        travelDistance(5)
        println("Burn fuel...")
        rocketStaging()
    }

    override fun rocketStaging() {
        fuelTankCapacity = 40
        travelDistance(50)
        println("release Body Tube... ")
        rocketUpperStageBurn()
    }

    override fun rocketUpperStageBurn() {
        travelDistance(70)
        println("Nozzle Burn... ")
        engineCutOut()
        fuelTankCapacity = 20
    }

    override fun engineCutOut() {
        travelDistance(100)
        fuelTankCapacity = 0
        println("release Engine...")
        println("Status: ${RocketStatus.SatelliteLaunched}")
    }
}
