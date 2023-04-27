package com.example.androidkotlin

//fun main() {
//    val calculator: Calculator = Addition(10,20)
//
//    val calculation: Int = when(calculator) {
//        is Addition -> calculator.number1 + calculator.number2
//        is Multiplication -> calculator.number1 * calculator.number2
//    }
//    println(calculation)
//
//}
sealed class Calculator : Calc {
    constructor()

    private constructor(number1: Int,number2: Int) : this()
}

class Addition(val number1: Int, val number2: Int) : Calculator()

class Multiplication(val number1: Int, val number2: Int) : Calculator()


open class Calc {

}
//
sealed interface Company

sealed interface Simform: Company

sealed interface Tata: Company

sealed interface SimformSolution: Simform

sealed interface SimformPvtLmt: Simform

sealed class Titen: Tata

class

sealed class Tcs : Tata

fun main() {



}
fun add(company: Company) {

    val result = when(company) {

        is SimformSolution -> println("simform solution")
        is Tcs -> println("tata")
    }

}
