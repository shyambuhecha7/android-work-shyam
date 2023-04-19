package com.example.ch2kotlin

class Car {
    fun run() {
        println("Car is running")
    }

    var carName: String = "Audi"

    fun printCarName() {
        println("car name is ${this.carName}")
    }


}

class OuterA {


    inner class InnerA {
        fun Int.foo() {
            val a = this@OuterA // OuterA()
            val b = this@InnerA // InnerA()

            val c = this // foo
            val d = this@foo // foo

        }
    }
}

//implicit this




fun main() {
    fun print() {
        println("Top level function")
    }
    class SquareShape {
        fun print() {
            println("Member function")
        }

        fun invokeFun(bool: Boolean = false) {
            if (bool) {
                print()
            } else {
                this.print()
            }
        }

        fun area(length: Int) {
            println("area : ${length * length}")
        }
    }
    val square = SquareShape()
    square.print()
    square.invokeFun(bool = true)
}