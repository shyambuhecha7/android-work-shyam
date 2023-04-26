package com.example.ch2kotlin.Practice

import android.app.Person

fun main() {
    val name: String? = null
    name?.let { println("Hello $name") }


    val fullName = name.run { name + " Buhecha" }
    println(fullName)

    val first = Cup(1)
    val second = Cup(1)

    if (first == second) {
        println("same")
    }else{
        println("not match")
    }

    if (first === second) {
        println("obj equal")
    }else {
        println("not match")
    }
}

data class Cup(val id: Int) {

}
