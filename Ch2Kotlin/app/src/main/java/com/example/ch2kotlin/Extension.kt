package com.example.ch2kotlin

class Extension  {

}
fun String.removeFirstLastChar(): String = this.substring(1,this.length-1)

fun main() {
    var string = "012345678"
    println(string.removeFirstLastChar()) // remove first and last char
}