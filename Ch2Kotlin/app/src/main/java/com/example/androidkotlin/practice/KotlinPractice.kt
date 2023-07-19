package com.example.androidkotlin.practice

abstract class PC(val name: String) {
    open fun connectWithCPU() {
        println("connect with PC")
    }

}


class Keyboard : PC("") {
    override fun connectWithCPU() {
        super.connectWithCPU()
        println("print Keyboard")
    }
}

//resolving override conflict
interface Pen {
    val colorOfPen: String
    fun writeABook(colorOfPen: String) {
        println(colorOfPen)
    }
}

interface BluePen {
    val colorOfPen: String
        get() = "BLUE"

    fun writeABook(colorOfPen: String) {
        println(colorOfPen)
    }
}

class Writer : Pen, BluePen {
    override val colorOfPen: String
        get() = "Blue"

    override fun writeABook(colorOfPen: String) {
        super<Pen>.writeABook(colorOfPen)
        super<BluePen>.writeABook(colorOfPen)
    }
}

enum class Colors(val colorHash: Int) {
    RED(123), BLUE(435), YELLOW(566), WHITE(855)
}

interface CompanionInterface {
    fun myCompanionObject() {
        println("this is companion object")
    }
}
class MyClassI {
    companion object: CompanionInterface {
        override fun myCompanionObject() {
            println("this is my companion object")
        }
    }
}
object ObjDeclaration {

}
fun main() {
    //calling function using anonymous object
    val objectExpression = object {
        fun printClassName() {
            println("Anonymous class")
        }
    }
    objectExpression.printClassName()
    //inherit the object




    val color = Colors.WHITE.colorHash
    println(color)
    val keyboard = Keyboard()
    keyboard.connectWithCPU()

    val nameList = listOf<String>("Ajay", "Jay", "Jayesh")
    println(nameList.reduce {acc, s -> acc + s } )
    println(nameList.associateWith { it.length })
    println(nameList.associateBy { it.length })

    val list = listOf<Int>(5, 7, 12, 10, 15, 33, 23, 20, 21, 67, 54, 65, 25)
    println(list.map { it - 5 })
    println("filter: ${list.filter { it % 5 == 0 }}")
    println(list.partition { it > 35 })

    println(list.any { it > 20 })
    println(list.none { it > 100 })
    println(list.all { it > 15 })

    println(list.groupingBy { it + 10 }.eachCount())

    val modelOfMobile: Any = "iPhone"
    if(modelOfMobile is String) {
        println(modelOfMobile.length)
    }else {
        println("not matched")
    }

    val y = "hello"
    val x : String = y as String

}