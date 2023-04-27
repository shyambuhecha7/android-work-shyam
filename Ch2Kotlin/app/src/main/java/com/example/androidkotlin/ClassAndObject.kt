package com.example.androidkotlin

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

class Student(var rollNumber: Int, var name: String, var stream: String, var college: String ) {


    init {

    }
    constructor(rollNumber: Int, name: String) : this(rollNumber,name,"Computer","GECR") {

    }

    constructor(name: String, stream: String) : this(1,name,stream,"GECR") {

    }


    constructor(name: String) : this(1, name,"", "") {
      this.name = name
    }

}

class Mobile() {
    constructor(model: String): this(){

    }
}

fun main() {
    var firstEmployee = Employee("Raj")
    firstEmployee.employeeId
    println(firstEmployee.employeeId)
    println(firstEmployee.name)

    var models = Mobile("name")

    val model2 = Mobile()
}