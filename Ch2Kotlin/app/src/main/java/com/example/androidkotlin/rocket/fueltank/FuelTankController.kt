package com.example.androidkotlin.rocket.fueltank

import kotlin.properties.Delegates

open class FuelTankController {
    var fuelTankCapacity by Delegates.observable(100) {_, _, newValue ->
       println("fuel Capacity change = $newValue% ....")
    }
}
