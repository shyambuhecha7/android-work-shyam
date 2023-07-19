package com.example.androidkotlin.collections

fun main() {
    var listOfNumbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17)

    //let
    listOfNumbers.map { it * 5 }.filter { it > 10 }.let { println(it) }

    listOfNumbers.map { it * 5 }.filter { it > 10 }.let(::println)

    //with
    with(listOfNumbers) {
        println("the length of list : ${listOfNumbers.size}")
    }


    //run
    var student = Student(1,"Shyam").run {
        rollNo = 10

    }

    //apply



}
 fun ApplyFunction() {
     val person = Student(2,"Sagar").apply {
         name = "Raj"
         rollNo = 3
     }

 }
class Student(var rollNo: Int,var name: String) {

}