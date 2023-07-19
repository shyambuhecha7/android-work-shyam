package com.example.androidkotlin.practice

//kt question
interface Vehicle {
    fun start()

    fun ride() {
        println(" i am drive a bike")
    }

    fun breakTobike()
}

class Bike : Vehicle {
    override fun start() {
        TODO("Not yet implemented")
    }

    override fun breakTobike() {
        TODO("Not yet implemented")
    }

     override fun ride() {
        println("i am riding..")
    }
}
abstract class MyAbstractClass {
    abstract fun sum()

    fun sum2() {
        println("sum2 method")
    }
}

class MyClass() : MyAbstractClass() {
    override fun sum() {
        TODO("Not yet implemented")
    }
}

class Mobile(val modelNameOfMobile: String, val priceOfMobile: Int) {

    constructor(name: String): this(name,1)

}

class  Outer {
    infix fun square(value: Int): Int {
        return value * value
    }

    open inner class InnerClass {
        var collegeName: String = "GECR"
        fun printCollegeName() {
            println(collegeName)
        }
    }

    inner class SubInnerClass : InnerClass() {
        val branch: String = "CE"

    }
}

class FlowerPot(var nameOfFlower: String) {
    var age: Int = 0
}
fun main() {
    val flowerPot = FlowerPot("Rose")
    println(flowerPot.nameOfFlower)
     flowerPot.apply { this.nameOfFlower = "Lotus"
     age = 10
     println(age)
     }

    println(flowerPot.age)
    println(flowerPot.nameOfFlower)
    val outer = Outer()

    println(outer square 5)
    val subInnerClass = outer.SubInnerClass()
    subInnerClass.collegeName = "GEC-Rajkot"
    subInnerClass.printCollegeName()

    val mobile = Mobile("Shyam",10)
    println(mobile.modelNameOfMobile)
    val listOfNumbers = listOf<Int>(12,2,14,23,65,44,45)
    println(listOfNumbers.fold(0) { acc: Int, i: Int -> acc + i })
    println(listOfNumbers.reduce { acc, i -> acc+i })
    println(listOfNumbers.sum())
    println(listOfNumbers.map { it+3 })
    println(listOfNumbers.filter { it > 22 })

    var s1 = listOf<Int>(1,2,11)
    val myClass = MyClass()
    myClass.sum2()

    println(10.unaryPlus())
    println(10.unaryMinus())
    println(12.inc())
    println(12.dec())

}

