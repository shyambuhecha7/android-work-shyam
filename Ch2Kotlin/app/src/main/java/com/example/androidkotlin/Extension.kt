package com.example.androidkotlin

class Extension  {

}
fun String.removeFirstLastChar(): String = this.substring(1,this.length-1)


fun sum(first: Int, second: Int): Int {
    return first+second
}

class Computer(){

}
fun Computer.keyboard() {
    println("typing...")
}
//Companion object extension
class Bike {
    companion object
}
fun Bike.Companion.rideBike() {
    println("I am ride a Bike")
}
fun String.getStringLength() {
    println(this.length)
}

//Declaring extensions as members
class Host(val hostName: String) {
    fun printHostname() {
        println("Host name is $hostName")
    }
}
class Connection(val host: Host, val port: Int) {
    fun printPort() {
        println("port: $port")
    }
    fun Host.printConnectionString() {
        printHostname()
        print(":")
        printPort()
    }

    fun connect() {
        host.printConnectionString()
    }
}

fun main() {
    //error create
    throw Exception("Hello")
    var string = "012345678"
    println(string.removeFirstLastChar()) // remove first and last char
    println(sum(10,20))
    //Companion obj. extension
    Bike.rideBike()
    //Scope of extensions
    "Shyam".getStringLength()
    //Declaring extensions as members
    Connection(Host("godaddy.host"),20233).connect()

    //
    val computer = Computer()
    computer.keyboard()
}




