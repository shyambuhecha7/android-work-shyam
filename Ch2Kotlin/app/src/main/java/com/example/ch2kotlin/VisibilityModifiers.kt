package com.example.ch2kotlin

class VisibilityModifiers {
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

class Sample private constructor(name: String) {

}