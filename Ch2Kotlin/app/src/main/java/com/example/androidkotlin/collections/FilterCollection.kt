package com.example.androidkotlin.collections

class FilterCollection {
}

fun main() {
    var listOfMarks = listOf<Int>(12, 35, 75, 79, 84, 27, 63, 92, 98, 44, 54, 66, 35)
    println(listOfMarks.filter { it > 60 })

    println(listOfMarks.filterIndexed { index, i -> index > 3 })
    println(listOfMarks.filterNotNull())

    //partition
    val (pass, fail) = listOfMarks.partition { it > 35 }
    println("pass: $pass")
    println("fail: $fail")

    val number = listOf<String>("one", "two", "three", "four")
    println(number.any { it.endsWith('e') })
    println(number.none { it.endsWith('e') })
    println(number.all { it.endsWith('e') })


}