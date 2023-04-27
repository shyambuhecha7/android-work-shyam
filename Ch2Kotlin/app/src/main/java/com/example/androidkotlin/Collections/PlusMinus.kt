package com.example.androidkotlin.Collections

fun main() {
    val number = listOf<String>("one", "two", "three", "four")
    println(number - "one")

    println(number + listOf("five", "six", "seven"))

    println(number + "ten" - listOf("one", "two", "ten"))

    println(number + "eleven")

    println(number + "fifty")


}