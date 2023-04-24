package com.example.ch2kotlin.Collections

fun main() {
    val numbers = setOf<Int>(1, 2, 3, 4, 5)
    println(numbers.map { it * 3 })
    println(numbers.mapIndexed { index, i -> i * index })

    println(numbers.mapNotNull { if (it == 2) null else it * 3 })

    var numberMap = mapOf<Int, String>(1 to "one", 2 to "Two", 3 to "three")
    println(numberMap.mapKeys { it.key })

    //zip
    val colors = listOf<String>("Red", "Orage", "yellow")
    val fruits = listOf<String>("Apple", "Orange", "Banana")

    println(colors.zip(fruits))

    //unzip
    println(numberMap.toList().unzip())

    //associate
    println(colors.associateWith { it.length })
    println(colors.associateBy { it.first().uppercaseChar() })

    //flatten
    val listOfSet = listOf<Set<Int>>(setOf(1, 2, 3), setOf(4, 5, 6), setOf(6, 7, 8))
    println(listOfSet.flatten())

    //
    println(colors.joinToString())

    //
    val listOfBuffer = StringBuffer("this is a string buffer")
    println()
}