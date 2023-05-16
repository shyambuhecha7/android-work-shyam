package com.example.androidkotlin

class Exception {
    /*
    Exception : all exeception in java inharit Throwable class
     */
}

fun main() {

    var result = 10/1
    println(result)


    try {
        var result = 10/0
        println(result)
    }catch (e : Throwable) {
        println("Exeption is : $e")
    }

    try {
        var array = arrayOf(1,2,3)
        println(array[7])
    }catch (exception : Throwable) {
        println("Exception id : $exception")
    }finally {
        println("always execute")
    }

    fun showError() {
        if(10<0) {
            throw Exception("zero is not greter than 10")
        }

    }

    showError()

    var b: String? = "@"

    println(b)
    


}

