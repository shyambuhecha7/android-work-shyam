package com.example.ch2kotlin.Rocket.SateliteLaunch

interface LaunchSatellite {
    fun rocketLaunch()   //hight - 0
    fun rocketPowerAscent()   //hight - 10 miles
    fun rocketStaging() //descharge first stage    //hight - 30
    fun rocketUpperStageBurn()   //hight - 50 miles
    fun EngineCutOut()  //hight - 100 miles
}