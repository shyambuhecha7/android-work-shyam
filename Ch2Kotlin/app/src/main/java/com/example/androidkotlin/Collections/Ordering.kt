package com.example.androidkotlin.Collections

fun main() {
    val numbers = listOf<String>("one", "two", "three", "four")
    println(numbers.sorted())
    println(numbers.sortedDescending())
    println(numbers.reversed())
    println(numbers.asReversed())
    println(numbers.shuffled())


}