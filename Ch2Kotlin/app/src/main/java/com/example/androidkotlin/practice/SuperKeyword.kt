package com.example.androidkotlin.practice

open class Base(value: String) {

}

class Derive(val value: String) : Base(value) {

}

class Derive2 {
    var a: Int = 0
    var b: String = ""
}
typealias i = Int


enum class Week(var value: Int) {
    DAY1(1)
    ;

    fun changeValue(v: Int) {
        DAY1.value = v
    }
}

fun main() {
    val week = Week.DAY1
    week.changeValue(3)
    println(Week.DAY1.value)


    val derive2 = Derive2()
    derive2.a = 12
    derive2.b = "b"

    val derive3 = Derive2()
    println(derive3.a)

}
