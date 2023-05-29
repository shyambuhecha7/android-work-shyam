package com.example.androidkotlin.practice

//Interface
interface Status {
    fun onSuccess()
}

abstract class _Status {
    abstract fun _onSuccess()
}

//data class alternatives
data class MyProfile(val myName: String)

fun main() {
    //iterator types :
    // list iterator()
    val listOfScores = listOf<Int>(20, 51, 34, 55, 100, 99)
    listOfScores.iterator()

    val mutableList = mutableListOf<Int>(20, 51, 34, 55, 100, 99)
    mutableList.iterator()
    println(mutableList.iterator().next())
    mutableList.add(1, 12)
    mutableList.add(122)
    mutableList.set(2, 33)

    for (i in 1..4) println(i)

    for (i in 10 downTo 1 step 2) println(i)

    //sequence vs list
    val sequence = sequenceOf(12, 11, 22, 22, 13, 43, 21)
    sequence.iterator().forEach { println(it) }

    val listOfGoal = listOf(12, 11, 22, 22, 13, 43, 21)
    listOfGoal.asSequence()

    val oddNumbers = sequence {
        yield(1)
        yieldAll(listOf(13, 13))
    }.iterator().forEach { println(it) }

    println(OuterEnum.InnerEnum.LARGE.ordinal)
    println(OuterEnum.InnerEnum.LARGE.name)

    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numbers.associate { it to it + 10 })

    var myNumList = listOf<Int>(12, 31, 23, 45, 54, 65, 73, 86, 92)
    myNumList.iterator().forEach { println(it) }

    for (item in myNumList) {
        println(item)
    }
    myNumList.forEach { println(it) }

}

enum class OuterEnum {
    ;

    abstract fun enumFunction()
    enum class InnerEnum {
        SMALL, MEDIUM, LARGE
    }
}