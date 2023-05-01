package com.example.androidkotlin.rocket

import com.example.androidkotlin.rocket.rocketlaunch.RocketController
import com.example.androidkotlin.rocket.rocketlaunch.RocketControllerInterface
import com.example.androidkotlin.rocket.satelitelaunch.*

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
    rocket.thrustRocket()
}
