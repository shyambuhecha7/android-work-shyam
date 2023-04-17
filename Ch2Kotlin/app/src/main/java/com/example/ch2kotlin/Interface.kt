package com.example.ch2kotlin

class Interface : MyInterface {


    override fun myFun() {
        println("Interface Function")
    }
}

fun main() {
    var myInterface = Interface()

    myInterface.implementedFunction()
    myInterface.myFun()

    //resloving conflict
    var myConflictClass = Conflict()
    myConflictClass.work()
}
interface MyInterface {


    fun implementedFunction() {
        println("Implemented Function")

    }
    fun myFun()
}

//resolving conflict
interface ItEmployee {
    fun work() {
        println("Employee working...")
    }
}
interface Worker {
    fun work() {
        println("Worker is working")
    }
}

class Conflict: ItEmployee, Worker {
    override fun work() {
        super<ItEmployee>.work() //call employee method
        super<Worker>.work() //call worker method
        println("ItEmplyee class method call")
    }


}
