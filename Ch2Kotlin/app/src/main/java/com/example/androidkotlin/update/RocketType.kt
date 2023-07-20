package com.example.androidkotlin.update

enum class RocketType(val fuelConsumptionRate: Double, val payloadCapacity: Double) {
    FALCON_9(60.0, 2000.0),
    DELTA_IV_HEAVY(30.0, 5000.0),
    ATLAS_V(40.0, 8000.0)
}