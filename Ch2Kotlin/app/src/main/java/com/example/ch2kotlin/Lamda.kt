package com.example.ch2kotlin

fun main() {
    val lambda = {
        println("this is lamda function")
    }
    lambda()

    //
    val product = {item: Int, price: Int -> item*price}
    val totalPrice = product(2,100)
    println("Total price = $totalPrice")

    //
    var sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    println(sum(20, 30))

    fun anonymous(value1: Int, value2: Int): Int {
        return value1+value2
    }
    val anonymousSum = anonymous(10,30)
    println(anonymousSum)

    userInfo("Shyam") {
        println(it)
    }

    println(isOdd(10))
    val a = 11

    var arryOfNumbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 10)
    val outputArray = arryOfNumbers.filter(::isOdd)
    println(outputArray)
    val max = arryOfNumbers.max()
    println(max)

    val newOuputArray = arryOfNumbers.filter { it > 5 }
    println(newOuputArray)



}

class Men {
    var name: String = "J.C Varma"
}
fun userInfo(userName: String, lambda: (string: String) -> Unit) {
    lambda(userName)
}

fun isOdd(number: Int) = number % 2 != 0
