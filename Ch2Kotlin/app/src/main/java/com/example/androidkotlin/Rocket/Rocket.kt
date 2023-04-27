package com.example.androidkotlin.Rocket

import com.example.androidkotlin.Rocket.SateliteLaunch.LaunchSatellite
import com.example.androidkotlin.Rocket.SateliteLaunch.LaunchSatelliteImpl
import com.example.androidkotlin.Rocket.SateliteLaunch.SatelliteDetails
import com.example.androidkotlin.Rocket.SateliteLaunch.SatelliteLanchingDetails

typealias details = SatelliteDetails
typealias  launchDetails = SatelliteLanchingDetails

class Rocket(
    private val rocketController: RocketControllerInterface,
    private val launchSatellite: LaunchSatellite
) : RocketControllerInterface by rocketController,
    LaunchSatellite by launchSatellite {
}

fun main() {
    val rocketController = RocketController()
    val launchSatellite = LaunchSatelliteImpl()

    val rocket = Rocket(
        rocketController,
        launchSatellite
    )

    rocket.startRocketLaunch()
    rocket.targetReach(true)

    val satelliteDetails: details = SatelliteDetails("ISRO-X", "ISRO", "INDIA")
    val satelliteLanchingDetails: launchDetails =
        SatelliteLanchingDetails("15-Aug-2023", "Ahamdabad ISRO", "Earth Orbit")

    rocket.thrustRocket()
}
