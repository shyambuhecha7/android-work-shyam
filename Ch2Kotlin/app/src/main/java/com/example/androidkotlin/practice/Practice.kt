package com.example.androidkotlin.practice

import kotlin.properties.Delegates

var objectOfCar = object {
    fun a() {
        println("car object")
    }
}

data class Cup(val id: Int)

open class Myclass {
    companion object

    var lambda: (Int) -> Unit = { i ->
        println("call lambda value : $i")
    }

}
 fun Myclass.Companion.printName(name: String): String {
     return name
 }
//abstract class A {
//    abstract fun a()
//}
//
//abstract class B : A() {
//
//}
//abstract class Sample {
//
//}


class  OuterClass {
    open inner class InnerClass {
        var collegeName: String = "GECR"
        fun printCollegeName() {
            println(collegeName)
        }
    }
    inner class SubInnerClass: InnerClass() {
        val branch: String = "CE"

    }
}
fun main() {
    val outer = OuterClass()
    val subInnerClass = outer.SubInnerClass()
    subInnerClass.collegeName = "GEC-Rajkot"
    subInnerClass.printCollegeName()

    val expreObj = object {
        fun add() {
            println(5)
        }
    }
    expreObj.add()
    var l : String by Delegates.observable("Hello") { property, oldValue, newValue ->
        println("$oldValue : $newValue")
    }
    l = "abdf"
    l = "ajdjjd"

    var m : Int by Delegates.vetoable(10) { property, oldValue, newValue ->
        println("$oldValue- $newValue")
        newValue > 5
    }
    m = 12
    m = 2
    m =10

    val name: String? = null
    name?.let { println("Hello $name") }

    val fullName = name.run { name + " Buhecha" }
    println(fullName)

    val first = Cup(1)
    val second = Cup(1)

    if (first == second) {
        println("same")
    }else{
        println("not match")
    }

    if (first === second) {
        println("obj equal")
    }else {
        println("not match")
    }
    val myName = Myclass.Companion.printName("Shyam")
    println(myName)

    val arrOne = arrayOf(11,12,13)
    val arrTwo = arrayOf(null,2,null)
    println(arrOne zip arrTwo)

    val mapOne = mapOf<Int, String>(1 to "one", 2 to "two", 3 to "three", 4 to "four").also {
        it.get(1)
    }
    println(arrOne.associateWith { it + 10 })

    var numberArr = arrayOf(arrOne,arrTwo)
    println(numberArr.flatten())

    val (part1,part2) = arrOne.partition { it > 2 }
    println("p1: $part1 p2: $part2")

    val arrOfNumbers = listOf<Int>(1,2,3,4,5,6,7,8,9,0)
    println(arrOfNumbers.fold(1,{sum,element -> sum + element}))

    val sampleObj = SampleClass()
    sampleObj.print()
}
interface SampleIterface{
   fun print()
}
interface Sample2Interface {
    fun print()
}

class SampleClass: SampleIterface, Sample2Interface {
    override fun print() {
        println("print")
    }
}
enum class weeks{

}
var array = arrayOf(1,23,3)

////
//import kotlin.properties.Delegates
//
//class FuelSystem(var capacity: Int) {
//    var currentFuel: Int by Delegates.vetoable(0) {_, _, newValue ->
//        newValue <= capacity
//    }
//    fun addFuel(addToFuelTank: Int) {
//        currentFuel += addToFuelTank
//    }
//
//}