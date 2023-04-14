package com.example.ch2kotlin

class ClassAndObject {

}

//empty class
class Empty

class Demo(firstName : String) {

    init {
        println("First initializer block that prints $firstName")
    }

}
class Person(var firstName: String) {

}
// class Customer public @inject constructor(name: String) {
//
//}
//secondary constructor
class Employee {
    var name : String
    var employeeId : Int

    constructor(name: String) {
        this.name = name
        this.employeeId = 1
    }
    constructor(name: String, employeeId: Int) {
        this.name = name
        this.employeeId = employeeId
    }
    init {
        println("Initialize")
    }
}

fun main() {
    var firstEmployee = Employee("Raj")
    firstEmployee.employeeId
    println(firstEmployee.employeeId)
    println(firstEmployee.name)

}