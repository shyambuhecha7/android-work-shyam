package com.example.ch2kotlin

class TypeCase {

    fun checType(value: Any) {
        if (value is String) {
            println(value.length)
        }
    }

}

fun main() {

    if (10 > 0) println("10 is larger than 0")

    //Check and Cast Type

    //is & !is is runtime check
    var strName = "Shyam"
    if (strName is String) {
        println("$strName is a String and length is ${strName.length}")
    }

    if (strName !is String) {
        println("it is not int")
    } else {
        println("it is string")
    }

    var typeCaseObject = TypeCase()
    typeCaseObject.checType("Shyam")

    if (strName !is String) return

    //&& , ||
    if (strName is String && strName.length > 0)
        println(strName.length)

    //unsafe cast operator


}

interface Shape {
    fun calculateArea() : Double
}

class Circle : Shape {
    var radius = 10.2
    override fun calculateArea(): Double {
        return 3.14 * radius * radius
    }
}

class Square : Shape {
    var side = 10.3
    override fun calculateArea(): Double {
        return side * side
    }


}





