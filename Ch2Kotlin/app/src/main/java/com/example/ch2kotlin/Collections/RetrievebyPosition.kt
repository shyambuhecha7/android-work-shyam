package com.example.ch2kotlin.Collections

import androidx.core.graphics.rotationMatrix
class RetrievebyPosition {

}
fun main() {
    var listOfNumbers = listOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17)
    println(listOfNumbers.elementAt(3))
    println(listOfNumbers.elementAtOrNull(4))
    println(listOfNumbers.first())
    println(listOfNumbers.last())
    println(listOfNumbers.elementAtOrNull(111))
    println(listOfNumbers.elementAtOrElse(100) { index -> println("$index value is undefind") })
    println(listOfNumbers.first{ it > 10})
    println(listOfNumbers.firstOrNull())
    println(listOfNumbers.random())
    println(listOfNumbers.contains(3))
    println(listOfNumbers.containsAll(listOf(1,2,3)))
    println(listOfNumbers.isEmpty())
    println(listOfNumbers.isNotEmpty())

}