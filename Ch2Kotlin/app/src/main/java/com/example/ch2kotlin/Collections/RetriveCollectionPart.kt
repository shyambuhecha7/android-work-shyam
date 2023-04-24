package com.example.ch2kotlin.Collections

class RetriveCollectionPart {
}

fun main() {
    val numbers = listOf<String>("one","two","three","four","five","six","seven","eight","nine","ten")
    //slice
    println(numbers.slice(1..3))
    println(numbers.slice(0..6 step 2))
    println(numbers.slice(setOf(0,4,7)))

    //take and drop
    println(numbers.take(2))
    println(numbers.takeLast(100))
    println(numbers.drop(2))
    println(numbers.dropLast(3))

    //Chunked
    var listOfNumbers = listOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17)
    println(listOfNumbers.chunked(4))

    //Windows
    println(listOfNumbers.windowed(4))


}