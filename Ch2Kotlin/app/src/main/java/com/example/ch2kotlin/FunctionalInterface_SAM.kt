package com.example.ch2kotlin

fun interface CookInterface {
    fun cooking()
}

class Cook(val cookName: String, val racipe: String) : CookInterface {
    override fun cooking() {
        println("$cookName is cook a $racipe")
    }
}

//SAM conversion
fun interface Reader {
    fun readBook()
}

val read = Reader { println("student read a books") }

class Students : Reader {
    override fun readBook() {
        println("student read a books")
    }
}

fun main() {
    val cook = Cook("Jems", "Cookies")
    cook.cooking()
    //before conversion
    Students().readBook()
    //after conversion
    read.readBook()
}
