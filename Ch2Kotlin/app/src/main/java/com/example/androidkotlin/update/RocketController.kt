package com.example.androidkotlin.update

open class RocketController(
    val name: String,
    var velocity: Int,
    var fuelCapacity: Double,
    private val countdownTime: Int,
    private val targetDistance: Double,
    val rocketType: RocketType
) : ControlSystem {
    var fuelLevel: Double = 0.0
    var timeInSpace: Double = 5.0
    var distanceTraveled: Double = 0.0
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
            Thread.sleep(500)
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
            fuelLevel -= rocketType.fuelConsumptionRate * timeInSpace

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

    private fun calculateTravelStats() {
        val averageSpeed = distanceTraveled / timeInSpace
        println("$name traveled a distance of $distanceTraveled km in $timeInSpace seconds at an average speed of $averageSpeed km/s.")
    }

    private fun isCloseSignalReceived(): Boolean {
        return false
    }

    override fun igniteEngine() {
        println("Igniting engines for $name.")
        isEngineIgnited = true
    }

    override fun shutdownEngine() {
        println("Shutting down engines for $name.")
        isEngineIgnited = false
    }

    override fun deploySatellite() {
        println("Deploying satellite from $name.")
    }
}
