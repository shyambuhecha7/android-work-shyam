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


}