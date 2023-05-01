package com.example.androidkotlin.Collections

fun main() {
    val value = 3
    if (value in 1..5) {
        println(value)
    }
    for (index in 1..3) print(index)

    println()

    for (index in 4 downTo 2) print(index)

    for (index in 2..8 step 2) println(index)

    for (index in 10 downTo 1 step 2) println(index)

    for (index in 1 until 10) println(index)
}