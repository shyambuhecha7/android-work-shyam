package com.example.ch2kotlin.Collections

fun main() {
    val numbers = listOf<String>("one", "two", "three", "four")
    println(numbers.sorted())
    println(numbers.sortedDescending())
    println(numbers.reversed())
    println(numbers.asReversed())
    println(numbers.shuffled())


}