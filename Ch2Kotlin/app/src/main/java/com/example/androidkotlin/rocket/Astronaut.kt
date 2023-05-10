package com.example.androidkotlin.rocket

class Astronaut(private val name: String) {
    fun performPreLaunchChecklist() {
        println("$name is performing pre-launch checklist...")

        repeat(5) { i ->
            Thread.sleep(500)
            print(".")
        }
        println("\n$name has completed the pre-launch checklist!")
    }
}