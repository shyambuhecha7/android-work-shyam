package com.example.ch2kotlin.Collections

class Sequences {
}
fun main() {
    var numebers = sequenceOf(2, 12, 31, 22, 21)
    var sequenceOfNumber = numebers.asSequence()
    println(sequenceOfNumber.iterator())

}