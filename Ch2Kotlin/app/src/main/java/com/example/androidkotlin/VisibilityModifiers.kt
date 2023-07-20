package com.example.androidkotlin

fun main() {
    val extendVisibilityModifier = ExtendVisibilityModifier()
    extendVisibilityModifier.test()
}
open class VisibilityModifiers {

    public var one = 1
    private var two = 2
    protected var three = 3
    internal var four = 4
}

class ExtendVisibilityModifier : VisibilityModifiers() {
    fun test() {
        println(one)
      //  println(two) private not access
        println(three)
        println(four)
    }
}



//wrapper
//type cast vs type conversion java



class Sample private constructor(name: String) {

}

class VisibilityMethods {

    public fun publicMethod() {
        println("Visible everyware")
    }

    private fun privateMEthod() {
        println("Only accessible in Current file")
    }

    internal fun internalMethod() {
        println("accessable in same module")
    }

    protected fun protectedMethod() {

    }
}