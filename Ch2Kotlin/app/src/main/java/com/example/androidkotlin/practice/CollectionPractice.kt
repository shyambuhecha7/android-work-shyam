package com.example.androidkotlin.practice

class CollectionPractice {
}

class Source {
    var sendData = {data:String ->
        println("send data: $data")
    }
}
class Destination {
    fun receiveData(data: String, callBack: (String)->Unit) {
        callBack(data)
    }
}
data class Person(val name: String, val age: Int)
fun main() {
    val mutableList = mutableListOf(1,2,3,22,2,2,12)
    val set = mutableList.toSet()
    println(set)

    val source = Source()
    val destination = Destination()

    destination.receiveData("Simform",source.sendData)

//    for ( i in 10 downTo  2 step 2) {
//        println(i)
//    }
//    for (i in 12 downTo 2 step 5) {
//      println(i)
//    }
//    for (i in 12 until 15) print(i)

    var sequence = sequenceOf(12,21,12,32,244)
    sequence.let { println(it.asSequence()) }


    val numbers = listOf(1, 2, 3, 4, 5)
    numbers.forEach { println(it) }

    val squaredNumbers = numbers.map { it * it }
    println(squaredNumbers)

    val people = listOf(
        Person("Alice", 25),
        Person("Bob", 30),
        Person("Charlie", 20)
    )

    val sortedPeople = people.sortedBy { it.age }
    println(sortedPeople)

    val sortedPeople1 = people.sortedWith(compareBy { it.age })
    println(sortedPeople1)

    val foundNumber = numbers.find { it > 3 }
    println(foundNumber)

    val hasEvenNumber = numbers.any { it % 2 == 0 }
    println(hasEvenNumber)

    val allPositive = numbers.all { it > 0 }
    println(allPositive)

    val flattenedNumbers = numbers.flatMap { listOf(it, it * 2) }
    println(flattenedNumbers)

    val takenNumbers = numbers.takeWhile { it < 4 }
    println(takenNumbers)

    val (evenNumbers, oddNumbers) = numbers.partition { it % 2 == 0 }
    println(evenNumbers)
    println(oddNumbers)

    numbers.windowed(3) { window ->
        println("Window: $window")
    }

    val sum = numbers.reduceOrNull { acc, value -> acc + value }
    println(sum)

    //invoke
    val add: (Int, Int) -> Int = { a, b -> a + b }

    val result = add.invoke(3, 4)
    println(result)
}