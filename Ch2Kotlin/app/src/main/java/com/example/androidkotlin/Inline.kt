package com.example.androidkotlin

class Sample2 {

}

fun main() {
    println(usernameObject.username)

    val name = Name("UserX")
    println(name.length)
    println(name._name)
    name.greet()
}
//inline class

@JvmInline
value class Username(val username: String)

val usernameObject = Username("Shyam")

@JvmInline
value class Name(val _name: String) {
    init {
        println(_name)
    }

    val length: Int
        get() = _name.length
    fun greet() {
        println("Hello $_name")
    }
}
//iniline type