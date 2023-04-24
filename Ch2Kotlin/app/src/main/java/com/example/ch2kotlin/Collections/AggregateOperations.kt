package com.example.ch2kotlin.Collections

class AggregateOperations {}

fun main() {
    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,10)

    println(numbers.minOrNull())
    println(numbers.maxOrNull())
    println(numbers.average())
    println(numbers.sum())
    println(numbers.count())

    println(numbers.reduce { sum, number -> number + sum })
    println()

}