package com.example.androidkotlin.collections

fun main() {
    val listOfNumbers = mutableListOf<Int>(1, 2, 3, 4, 5)
    listOfNumbers.add(6)
    println(listOfNumbers)

    listOfNumbers.addAll(arrayOf(12, 21, 22))
    listOfNumbers.addAll(setOf(43, 54, 2, 32))
    listOfNumbers += 122
    listOfNumbers += arrayOf(56, 45, 34, 55)

    listOfNumbers.remove(2)
    listOfNumbers -= 3
    listOfNumbers -= listOf<Int>(54, 55)

    //Retrieve elements by index
    listOfNumbers.get(1)
    listOfNumbers[2]
    listOfNumbers.getOrNull(2)
    listOfNumbers.indexOf(2)

    val numbers = (0..13).toList()
    println(numbers.subList(3, 6))
    numbers.indexOfFirst { it > 2 }
    numbers.indexOfLast { it > 2 }

    //binary search
    numbers.binarySearch(1)

    //add,remove,update,sort
    listOfNumbers.add(20)
    listOfNumbers.remove(20)
    listOfNumbers.sort()
    listOfNumbers[6] = 22

    //Set-specific operations
    val setOfNumbers = setOf<Int>(2, 3, 4, 12, 33, 54, 67, 87, 98, 45, 32, 12, 1)
    //union, intersect, and subtract

    //map
    val mapOfNumbers = mapOf(
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "key1" to 11,
        "key2" to 21,
        "key3" to 31,
        "key11" to 41
    )
    println(mapOfNumbers.get("one"))
    println(mapOfNumbers["one"])
    println(mapOfNumbers.getOrDefault("four", 4))
    println(mapOfNumbers["five"])
    println(mapOfNumbers.keys)
    println(mapOfNumbers.values)

    val filterMap = mapOfNumbers.filter { (key, value) -> key.endsWith("l") && value > 10 }
    println(filterMap)

}