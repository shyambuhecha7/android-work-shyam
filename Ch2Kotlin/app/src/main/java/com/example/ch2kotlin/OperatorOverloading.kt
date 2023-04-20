package com.example.ch2kotlin

interface IndexedConatiner {
    operator fun get(index: Int)
}

class OrderList : IndexedConatiner {
    override fun get(index: Int) {
        println(index)
    }
}

fun main() {
    val orderList = OrderList()
    orderList.get(2)

    //unary operator: -a, +a, !a
    var a: Int = 2
    println(a)

    println(a.inc()) //a++
    println(a.dec()) //a--
    println(a.plus(10))
    println(a.minus(1))
    println(a.times(5))
    println(a.div(1))
    println(a.rem(2))
    println(a.rangeTo(10))

    //in operator
    val numbers = arrayOf(1, 12, 13, 4)

    println(numbers.contains(a)) // a in b
    println(!numbers.contains(a)) // !a in b

    //Indexed access operator
    var userName = "User"
    println(userName.get(2))
    println(numbers.get(1))
    numbers.set(2, 23)
    println(numbers)

    /*
invoke operator:
a() - a.invoke()
a(i)- a.invoke(i)
a(i, j)- a.invoke(i, j)
a(i_1, ..., i_n) - a.invoke(i_1, ..., i_n)
     */

    //Equality and inequality operators
    // a == b  - a?.equals(b) ?: (b === null)
    // a != b -  !(a?.equals(b) ?: (b === null))

    val first = 100
    val second = 20

    println(first.compareTo(second))
}

