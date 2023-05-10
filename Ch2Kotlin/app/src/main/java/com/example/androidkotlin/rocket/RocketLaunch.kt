package com.example.androidkotlin.rocket

import kotlin.properties.Delegates
import kotlin.random.Random

class RocketLaunch(private val rocket: Rocket, private val observer: LaunchObserver) {
    private var countdown by Delegates.observable(5) { _, oldVal, newVal ->
        println("Countdown: $newVal")
        if (newVal == 1) {
            igniteRocket()
        }
    }

    fun startLaunching() {
        val astronaut = Astronaut("Shyam")
        astronaut.performPreLaunchChecklist()
        Thread {
            repeat(5) { i ->
                Thread.sleep(500)
                countdown = 5 - i

            }
            if (countdown > 1) {
                observer.onLaunchAborted(
                    LaunchResult(
                        false,
                        "Launch aborted: countdown interrupted"
                    )
                )
                return@Thread
            }
        }.start()
    }

    private fun igniteRocket() {
        val controller = RocketController(rocket)
        controller.igniteEngines()
        val launchResult = LaunchResult(
            Random.nextBoolean(),
            if (Random.nextBoolean()) "Engine failure detected" else "No issues detected"
        )
        launchResult.apply {
            if (!success) {
                observer.onLaunchAborted(this)
                return
            }
        }
        val missionController = MissionControl(Mission("Mars mission", 100))
        missionController.notifyLaunchSuccess()
    }
}