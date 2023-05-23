package com.example.androidkotlin.practice

class Practice3 : BaseClass() {

}
open class BaseClass(val name: String) {
    constructor() : this("Shyam")

    val surname = "Buhecha"

}
class Sender {
    fun sendDataToReceiver(data: String, callBack: (String) -> Unit) {
        callBack.invoke(data)
    }
}

class Receiver {
    fun processData(data: String) {
        println("receive Data: $data")
    }
}
abstract class A {
    abstract fun add()
}
class B : A() {
    override fun add() {
        println("ADD")
    }
}
fun main() {
    val classA = B()
    classA.add()
    val objectOfSender = Sender()
    val objectOfReceiver = Receiver()

    objectOfSender.sendDataToReceiver("My Data") {receivedData ->
        objectOfReceiver.processData(receivedData)
    }


    val list =
        listOf("city- ahamdabad", "city- Rajkot","simform-ReactNative", "country - India", "country - Rusia","number-1","number-2","number-3","simform-nativeMobile")
    val listOfCity = list.filter { it.startsWith("city")  }.map { it.substringAfter("city- ") }
    println(listOfCity) //[ahamdabad, Rajkot]



    val baseClass = BaseClass("Shyam")
    val practice3 = Practice3()

    println(baseClass.name)
    println(practice3.name)
}

