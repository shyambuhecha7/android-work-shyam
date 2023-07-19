package com.example.androidkotlin.collections

fun main() {
    val numbers = mutableListOf<String>("one", "two", "three", "four","five", "six","seven")
    println(numbers.sorted())
    println(numbers.sortedDescending())
    println(numbers.reversed())
    println(numbers.asReversed())
    println(numbers.shuffled())

    println(numbers.sorted())
    println(numbers.elementAt(2))
    println(numbers.last())
    println(numbers.find { it.length > 4 })
    println(numbers.findLast { it.length == 3 })
    println(numbers.random())
    println(numbers.randomOrNull())




}