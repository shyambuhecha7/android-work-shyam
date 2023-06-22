package com.example.androidkotlin

open class Aa(val name: String) {
}
class Aaa: Aa {
    constructor(name: String) : super(name)
}

open class Ractangle {
    fun draw() {
        println("draw a ractangle")
    }
}

class FillRactangle : Ractangle() {

    fun  fill() {
        super.draw()
    }
}

open class Vehicle(val brand: String) {
    open fun accelerate() {
        println("Vehicle is accelerating.")
    }
}

class SportCar : Vehicle {
    val colorOfCar: String

    constructor(brand: String, color: String) : super(brand) {
        this.colorOfCar = color
    }

    override fun accelerate() {
        super.accelerate()
        println("Car is accelerating.")
    }
}
fun main() {
    val fill =  FillRactangle()
    fill.fill()

    val audi = SportCar("Audi", "Black")
    audi.accelerate()
}