package com.example.ch2kotlin


//nested : class into class
class Outer {
    fun testOuter() {
        println("this is outer class method ")
    }
    class Nested {
        fun test() {
            println("this is nested class function")
        }
    }
}

//inner class
class OuterClass {
    var firstName: String = "Shyam"
    var surName: String = "Buhecha"

    fun fullName() {
        println("Full Name : $firstName $surName")
    }
    inner class InnerClass {
        fun printUsername(){
            println("(inner class)Username : $firstName")
        }
    }
}
//ANNONOMYOUS inner class
interface User2 {
    fun showUser()
}
fun main() {
    val outerObject = Outer()
    outerObject.testOuter()

    //nested class object
    val nestedObject = Outer.Nested()
    nestedObject.test()

    //inner class object
    val innerClasSObject = OuterClass().InnerClass()
    innerClasSObject.printUsername()

    //annomyous inner class
    var user : User2 = object  : User2 {
        override fun showUser() {
            println("this is user")
        }
    }

}