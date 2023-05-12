package com.example.androidkotlin.rocketdemo

sealed class Task {
    object PrepareForLaunch : Task()
    object ExecuteMission : Task()
    object ReturnToEarth : Task()
}