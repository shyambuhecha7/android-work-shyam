package com.example.ch2kotlin

class ConditionsAndLoop {

}

fun main() {
    var number1 = 10
    var number2 = 20

    var max = number1
    var min = number1
    if (number1 < number2) max = number2

    println("max : $max")

    //with if-else
    if (number1 > number2) {
        max = number1
    } else {
        max = number2
    }
    println(max)

    max = if (number1 < number2)
        number2
    else
        number1
    min = if (number1 > number2) number2 else number1

    println("max is $max and min is $min")

    val minimum: Int = if (number1 < number2) {
        println("choose number1")
        number1
    } else {
        println("choose b")
        number2
    }

    //when
    val value = 3
    when (value) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        else -> {
            println("Not Matched")
        }
    }

    //exhaustive

    var bit = when (Bit.Zero) {
        Bit.Zero -> 0
        Bit.One -> 1
    }
    println("Bit is $bit")

    when (bit) {
        0, 1 -> println("bit == 0 or bit == 1")
        else -> println("not matched")
    }

    var strName = "Shyam"
    when(strName) {
        "Shyam","shyam" -> println("user is Shyam")
        "Darshan","daeshan" -> println("user is darshan")
        "Subham","subham" -> println("user is subham")
        else -> println("user is not match")
    }
    var count = 5

    when (count) {
        in 1..5 -> println("count is in range")
        in 5..10 -> println("outside the range")
        else -> println("not in above")
    }

    var numbers = arrayOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)

    for (element in numbers) {
        print("$element ")
    }


    for (element: Int in numbers) {
        println(element)
    }

    for (element in 1..10) {
        println()
    }

    for (element in 6 downTo 1 step 2) {
        println(element)
    }

    var `if` = 10
    println(`if`)

    for (element in numbers.indices) {
        println(element)
    }

    for ((index, value) in numbers.withIndex()) {
        println("$index : $value")
    }

    var endValue = 5
    while (endValue > 0) {
        println(endValue)
        endValue--
    }

    do {
        println("do call first")
    } while (endValue > 0)

    //break and continue

    go@ for (item in 1..5) {
        for (item2 in 1..5) {
            println(item2)
            if (item2 == 2) {
                break@go
            }
        }
    }

    for (item in 1..5) {
        for (item2 in 1..5) {
            println(item2)
            if (item2 == 2) {
                continue
            }
        }
    }
}

enum class Bit {
    Zero, One
}