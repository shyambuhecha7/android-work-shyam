package com.example.androidkotlin.rocket.solarsystem

sealed class Planets {
    data class Mercury(val planetName: String, var distance: Long, val angle: Double)
    data class Venus(val planetName: String, var distance: Long, val angle: Double)
    data class Earth(val planetName: String, var distance: Long, val angle: Double)
    data class Mars(val planetName: String, var distance: Long, val angle: Double)
    data class Jupiter(val planetName: String, var distance: Long, val angle: Double)
    data class Saturn(val planetName: String, var distance: Long, val angle: Double)
    data class Neptune(val planetName: String, var distance: Long, val angle: Double)
}
