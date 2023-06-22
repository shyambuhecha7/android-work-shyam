package com.example.androidkotlin.collections

fun main() {

    val list = mutableListOf<Int>(10,20,30,40)
    //
    list.add(1,100)

    //Access to element
    list[2].let { println(it) }

    //modify ele.
    list[1] = 200

    list.size

    list.isEmpty()

    // check the element existence
    list.contains(10)
    10 in list

    //filtering
    println(list.filter { it > 20 })

    //map
    println(list.map { it * 2 })

    //sorted
    println(list.sorted())

    //reversed
    println(list.reversed())

    //all,any,none
    list.any{ it > 20}.let { println(it) }
    list.all { it > 0 }.let { println(it) }
    list.none{ it > 1000}.let { println(it) }

    //sum
    list.sum()

    //shuffle
    println(list.shuffle())

    //
    //fill - replace all element
    list.fill(10)

    //map .....
    val map = mapOf<String, Int>("A" to 1, "B" to 2, "C" to 3)
    println(map.size)
    println(map["C"])
    println(map.get("C"))

    map.keys
    map.values

    

}