package com.example.ch2kotlin.Rocket

class RocketDetailsImpl() : RocketDetailsInterface {
    override fun showRocketDetails(
        rocketName: String,
        rocketModel: String,
        rocketLanchDate: String,
    ) {
        println(" Rocket Name: $rocketName \n Rocket Model: $rocketModel \n Rocket Launch Date: $rocketLanchDate")
    }
}
