package com.example.ch2kotlin

fun main() {
//    var  penBox : Int = 10
//    penBox = null

    //penBox is nullable
    var  penBox : Int? = 10
   // penBox = null
    println(penBox)

    val pen = if (penBox != null) penBox else 0
    println(penBox)

    val isPenBoxEmpty = penBox == null
    println("pen box is empty ?  : $isPenBoxEmpty")

    var myName: String? = "Shyam"
    println(myName)

    if(myName != null && myName.length > 0) {
        println("String of length : ${myName.length}")
    }else {
        println("it is empty")
    }

    //Safe call : use in chain

    var first: String? = "first"
    println(first?.length)
    var second: String? = null
    println(second)


    //nullable recevier
    var name: String? = "Shyam"
    //

    //elvis operator
    val elvisOperatorOutput: Int = name?.length ?: -1
    println(elvisOperatorOutput)

    //assert operator
    val assertOperatorOutput = name!!.length

    println(assertOperatorOutput)

    //

//    var a = A()
//    a?.b?.chars()?.d

    var nullableList = arrayOf(1,2,3,null,4,5)
    var notnullblelist = nullableList.filterNotNull()
    println(notnullblelist)

    //
    var one: Int = 10
    var oneInt: Int? = one as? Int
    println(oneInt)
}

//
//open class A : B(){
//    var b: String? = "b"
//}
//
//open class B : C() {
//    var c: String? = "c"
//}
//
//open class C {
//    var d: String? = "d"
//}