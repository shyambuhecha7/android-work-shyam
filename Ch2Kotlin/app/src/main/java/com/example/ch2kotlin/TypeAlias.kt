package com.example.ch2kotlin

class TypeAlias {
    var count: i = 10


}

fun main() {



}
private typealias i = Int
typealias gameInner = Game.ClashOfClan

class Sport {
    var sportName: String = "Cricket"
    inner class Cricket {

    }
}

class Game {
    var gameName: String = "Clash Of Clam"
    inner class ClashOfClan {
        fun printGameName() {
            println("Game name is $gameName")
        }
    }
}
