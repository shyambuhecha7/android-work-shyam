package com.example.androidkotlin.rocketdemo

import kotlin.properties.Delegates

class FuelSystem(var capacity: Int) {
    var currentFuel: Int by Delegates.vetoable(0) {_, _, newValue ->
        newValue <= capacity
    }
    fun addFuel(addToFuelTank: Int) {
        currentFuel += addToFuelTank
    }

}