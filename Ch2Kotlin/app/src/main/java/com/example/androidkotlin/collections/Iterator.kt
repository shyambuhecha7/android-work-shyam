package com.example.androidkotlin.collections

class Iterator {

}

fun main() {
    var myNumList = listOf<Int>(12,31,23,45,54,65,73,86,92)
    myNumList.iterator().forEach { println(it) }

    for(item in myNumList) {
        println(item)
    }
    myNumList.forEach{ println(it) }

    val mutableList = mutableListOf<Any>("A",12, arrayOf(1,2,3))
    mutableList.add(12)
    mutableList.iterator()

    var listOfNum = listOf<Int>(1,2,4,5,6,5)
    listOfNum.filter { it > 2}

    listOfNum.map { it*3 }

    listOfNum.mapIndexed{k,v -> println("$k - ${v*5}") }





}
