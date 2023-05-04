package com.example.androidkotlin.rocket.update

abstract class Rocket(
    val name: String,
    var velocity: Double,
    var fuelCapacity: Double,
    val countdownTime: Int,
    val targetDistance: Double,
    val rocketType: RocketType
) : RocketControllerInterface {
    var fuelLevel: Double = 100.0
    var timeInSpace: Double = 10.0
    var distanceTraveled: Double = 2000.0
    var isEngineIgnited: Boolean = false

    fun addFuel(amount: Double) {
        fuelLevel += amount
        if (fuelLevel > fuelCapacity) {
            fuelLevel = fuelCapacity
        }
        println("Fuel level is now $fuelLevel liters.")
    }

    fun countdown() {
        println("Countdown started for $name.")
        (countdownTime downTo 1).forEach {
            println(it)
            Thread.sleep(1000)
            if (isCloseSignalReceived()) {
                println("Rocket Stop signal received. Countdown Stop.")
                return
            }
        }
    }

    fun launch() {
        if (fuelLevel == 0.0) {
            println("Cannot launch $name without fuel.")
            return
        }
        println("$name launching!")
        igniteEngine()
        while (fuelLevel > 0.0 && distanceTraveled < targetDistance) {
            val fuelConsumed = rocketType.fuelConsumptionRate * timeInSpace
            fuelLevel -= fuelConsumed
            if (fuelLevel < 0.0) {
                fuelLevel = 0.0
            }
            distanceTraveled = velocity * timeInSpace
            timeInSpace += 1.0
            println("$name is $distanceTraveled km away from the launch site at a speed of $velocity km/s.")
        }
        shutdownEngine()
        calculateTravelStats()
        if (distanceTraveled >= targetDistance) {
            deploySatellite()
        }
    }

    fun calculateTravelStats() {
        val timeTaken = timeInSpace
        val averageSpeed = distanceTraveled / timeTaken
        println("$name traveled a distance of $distanceTraveled km in $timeTaken seconds at an average speed of $averageSpeed km/s.")
    }

    abstract fun deploySatellite()


    private fun isCloseSignalReceived(): Boolean {
        // Logic to check for abort signal goes here.
        return false
    }
}
