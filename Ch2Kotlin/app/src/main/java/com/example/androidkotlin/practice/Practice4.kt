package com.example.androidkotlin.practice


class Shape(val shapeName: String) {

}

fun Shape.printShape() {
    println(shapeName.uppercase())
}

open class MyBaseClass() {

}

class ChildOfBaseClass : MyBaseClass() {

}

open class BaseCaller {
    open fun MyBaseClass.printCurrentYear() {
        println(2023)
    }
}

class Mango(val a: String) {
    constructor() : this("")
}


object Fan {
    fun isFanOn() {
        println("On")
    }
}

fun interface SAM {
    fun add()
}

class Practice4 {
    data class Pendrive(var size: Int) {

    }

}

infix fun Int.sum(num: Int): Int {
    return this + num
}

inline fun higherOrderFun(crossinline callback: () -> Unit) {
    println("callback before call ")
    callback()
    println("callback after call")
}

enum class Color {
    RED {
        override fun printValue() {
            println("Value is RED")
        }
    },
    BLUE {
        override fun printValue() {
            println("Value is BLUE")
        }
    },
    GREEN {
        override fun printValue() {
            println("Value is GREEN")
        }
    };

    abstract fun printValue()
}

//
class Phone(var modelName: String,val prize: Int) {
    constructor(model: String) : this(model,100000)
}

interface Heat {
    abstract fun heatLevel(temp: Float)
}

enum class Seasons(seasons: String): Heat {
  Winter("winter") {
      override fun heatLevel(temp: Float) {
          println("Heat : $temp ")
      }
  }
}

fun main() {

    Seasons.Winter.heatLevel(12.5f)

    val phone = Phone("MI")
    println(phone.modelName)
    phone
    //abstract key in enum
    val color: Color = Color.RED
    color.printValue()
    //crossline
    higherOrderFun { println("this is crossline function that can not return") }
    //infix notation
    println(10 sum 20)
    val myChild = ChildOfBaseClass()

    val circle = Shape("circle")
    circle.printShape()

    Fan.isFanOn()

    val AC = object {
        fun isACOn() {
            println("On")
        }
    }
    AC.isACOn()
//    val result = 10/0
//    try {
//        result
//    }catch (e: Throwable) {
//       // throw e
//    }

    var bottle: String? = "Bottle"
    bottle = null

    println()


    var samObj = SAM { println("it is SAM") }


    a@ for (j in 1..10) {
        if(j % 5 == 0) {
            break@a
        }
        println(" $j ")
    }


}