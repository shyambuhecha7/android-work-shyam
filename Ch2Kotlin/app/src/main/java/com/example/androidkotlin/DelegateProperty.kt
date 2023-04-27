package com.example.androidkotlin

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class DelegateProperty {
    var e: Int = 10
    operator fun getValue(thisref: Any?, property: KProperty<*>): String {
        return "$thisref"
    }

    operator fun setValue(thisref: Any?, property: KProperty<*>, value: String) {
        println("new value: $value, old value: $thisref")
    }
}

//lazy() property
val lazyValue: String by lazy {
    println("comuted..")
    "hello"
}
//observer
var name: String by Delegates.observable("no-name") { property, oldValue, newValue ->
    println("$oldValue -> $newValue")
}

//vetoable
var age: Int by Delegates.vetoable(18) { property, oldValue, newValue ->
    println("newvalue: $newValue")
    println("oldevalue: $oldValue")
    newValue >= 18
}
//storing to map
class User(val map: Map<String,Any?>) {
    val name: String by map
    val age: Int by  map
}
//LOCAL DELEGATE
fun sendRequest() {
    val response: Int by lazy { 10 }
}
class RectangleShape(val height: Double, val width: Double) {
    val shapeheight: Double by this::height
    val shapeWidth: Double by this::width
}
fun main() {
    val a = DelegateProperty()
    a.e = 10
    println(a.e)

    //lazy()
    println(lazyValue)
    //observer
    name = "Shyam"
    name = "Darshan"
    name = "Subham"
    //vetoable
    age = 20
    println(age)
    age = 10
    println(age)
    age = 222
    println(age)

    //storing to map
    val user = User(mapOf("name" to "Shyam",
    "age" to 21))
    println(user.name)
    println(user.map)
    //
    val rectangle = RectangleShape(12.3,24.22)
    println(rectangle.shapeWidth)
    println(rectangle.shapeheight)

}