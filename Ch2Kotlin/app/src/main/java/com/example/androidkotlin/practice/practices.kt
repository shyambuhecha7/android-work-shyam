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
fun main() {
    val listOfNumbers = listOf<Int>(12,2,14,23,65,44,45)
    println(listOfNumbers.fold(0) { acc: Int, i: Int -> acc + i })
    println(listOfNumbers.reduce { acc, i -> acc+i })
    println(listOfNumbers.sum())
    println(listOfNumbers.map { it+3 })
    println(listOfNumbers.filter { it > 22 })

    val myClass = MyClass()
    myClass.sum2()

}