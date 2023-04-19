package com.example.ch2kotlin

/*
structural: ==
referentional: ===
 */

fun main() {
    val value1 = 10
    val value2 = 10
    println(value1==value2 ?: false)
    val object1 = Equality()
    val object2 = Equality()

    val object3 = object1
     if(object1 === object3) {
        println("both object 1")
    }else {
         println("both object not same")
     }
}

class Equality {
    val number = 1
}