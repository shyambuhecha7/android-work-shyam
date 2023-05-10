package com.example.androidkotlin.rocket

class Main {
}

fun main() {
    val rocket = Rocket("Falcon 9")
    RocketLaunch(rocket, object : LaunchObserver {
        override fun onLaunchAborted(result: LaunchResult) {
            println("Launching aborted: ${result.message}")
        }
    }).startLaunching()


}