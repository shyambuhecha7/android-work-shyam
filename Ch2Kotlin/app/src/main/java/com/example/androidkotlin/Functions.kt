package com.example.androidkotlin

class Functions {
    //function
    fun functions(parameter: String): String {
        return parameter
    }
}



fun functionswithOArameter(parameter1: String, parameter2: String, parameter3: String) {

}

//trailing commas
fun functionWithTrailingComma(
    parameter1: String,
    parameter2: Int,
    parameter3: Boolean
) {}

//function with default parameter
fun morningGreet(quote: String = "Good Morning") {
    println("Morning Quotes: $quote")
}

//named argument

//return Unit
fun printName(name: String?): Unit {
    if(name != null)
        println("My name is $name")
     else
         println("Enter your name...")
}

fun increseValue(value: Int) : Int {
    println("function explicitly not return")
   // value + 10 //explicitly not return
    return value + 1
}
//Single-expression functions
fun sum(value1: Double, value2: Double): Double = value1 + value2

//Variable number of arguments (varargs)
fun <N> asList(vararg numbersArray: N): List<N> {
    val result = ArrayList<N>()
    for (element in numbersArray) {
        result.add(element)
    }
    return result
}

//Function scope :
//1.Local function - function into function
fun arithmaticOperation(radius: Double) {
    fun calculateArea(): Double = 3.14 * radius * radius
    val area = calculateArea()
    println("Area of Circle : $area")
}
//2.Member Function - Define in class
class SunFlower {
    fun color() {
        println("Sunflower is yellow.")
    }
}

//Generic Function
fun <String> genericFunction(data: String) {
   println(data)
}

//Tail recursive function



fun main() {
    val functionClassObject = Functions()
    println(functionClassObject.functions("Function call using class object"))

    //function directly call using class name
    Functions().functions("Function Direct call using Class name")
    //function with default parameter
    morningGreet()
    //return Unit
    printName("Shyam")
    //Single-expression functions
    sum(10.21,20.32)
    //explicitly return : (not possible in kotlin)
   val a =  increseValue(10)
    println(a)
    //variable number of argument
    val resultList = asList(0,1,2,3,4,5,6,7,8,9)
    println(resultList)

    //if we pass array all element in argument use `*` - spread operator
    val arrayOfNumbers = arrayOf(10,20,30)
    var otherResultList = asList(10, 21,*arrayOfNumbers,22,32 )
    println(otherResultList)

    //Function Scope - local function
    arithmaticOperation(12.23)

    //Function Scope - Member Function
    SunFlower().color()

    //Generic Function
    genericFunction("It is Generic Function")

    //Tail recursive function

    //Recursive function

    val result: Long
    var inputNumber: Int = 5

    fun fectorial(n: Int): Long {
        return if(n==1) n.toLong() else n * fectorial(n-1)
    }
    result = fectorial(inputNumber)
    println("Fectorial of $inputNumber : $result")

    //tail recursive
    var factorial = 1
   tailrec fun fectorialUsingTailRecursive(number: Int, run: Int = 1 ) : Long {

       return if(number==1) run.toLong() else fectorialUsingTailRecursive(number-1, number * run)
   }
    println("Fectorial using tail recursive : ${fectorialUsingTailRecursive(10)}")
}
















