package com.example.androidkotlin

//list
fun main() {
    val listOfNumbers = listOf<Int>(12, 14, 16, 34, 67, 54, 45, 34)
    println("list: $listOfNumbers")
    println("list length: ${listOfNumbers.size}")
    println("add to list: ${listOfNumbers.get(2)}")
    println(listOfNumbers[1])
    println(listOfNumbers.indexOf(3))

//    var person1 = Person("shyam")
//    var listOfPerson = listOf<Person>(person1, Person("darshan"),Person("Subham"),person1)

    val mutableList = mutableListOf<Int>(3, 1, 2, 33, 22)
    mutableList.add(2, 333)
    mutableList.get(2)

    //set
    var setOfVehicle = setOf<String>("Bike", "Car", "Cycle", "JCB", "Truck")
    println(setOfVehicle)
    println()

    //map
    var mapOfVehicle = mapOf<String, String>("Bike" to "Honda", "Car" to "Audi")
    println(mapOfVehicle.keys)
    println(mapOfVehicle.values)
    println(mapOfVehicle.size)
    println(mapOfVehicle.get("Car"))

    var mutableMapOfVehicle = mutableMapOf<String, String>("Bike" to "Honda", "Car" to "Audi")
    mutableMapOfVehicle.put("Cycle", "MyBike")


}