package com.example.ch2kotlin.Collections

fun main() {
    val numbers = listOf<String>("one", "two", "three", "four")
    println(numbers.groupBy { it.first().uppercase() })

    println(numbers.groupBy(keySelector = { it.first() }, valueTransform = { it.uppercase() }))

    println(numbers.groupingBy { it.first() }.eachCount())


}


