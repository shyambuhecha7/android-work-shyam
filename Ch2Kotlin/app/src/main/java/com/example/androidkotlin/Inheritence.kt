package com.example.androidkotlin

class Inheritence {
    /*
    ALl classes superclass is Any
    Any have three method : equals(), Hashcode(), toString()
    by default kotlin class is final.it is not inherited . use Open to inherit
     */
}
fun main() {
    val table = Table()
    table.sit()
    //single
    val myCat = Cat("catty")
    myCat.makeSound()

    //multi level
    val myDog1 = Dog1("Sheru")
    println("${myDog1.name} is my dog")
    myDog1.eat()
    myDog1.makeSound()

    //multiple using interface
    val frog = Frog()
    frog.jump()
    frog.swim()

    //Diamond problem
    val _frog = Frogs()
    _frog.swim()
    _frog.jump()
    _frog.animalInterface.animalName()

    //..

   val overide = Override()
    overide.fillColor
    println(overide.fillColor)

}

//single
open class Animal(val name: String) {
    open fun makeSound() {
        println("$name is making a sound.")
    }
}


class Cat(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name is meowing.")
    }
}

//multilevel

open class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        super.makeSound()
        println("$name is sound Bhow Bhow")
    }
}

open class Dog1(name: String) : Dog(name) {
    fun eat() {
        println("$name is eating")
    }
}
//hiarchial

//dimond problem : Hybrid inheritence (hiarchial + multiple)
open class person(val name: String,val surname: String) {
    open fun personFullName(name: String) {
        println("person full name is $name $surname                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ")
    }
}

interface work {
    fun workAtOffice()
}

//multiple

interface Swimable {

    fun swim()
}

class SwimableImplement: Swimable {

    override fun swim() {
        println("Swim")
    }
}

interface Jumpable {
    fun jump()
}

class JumpabalImplement: Jumpable {
    override fun jump() {
        println("jump")
    }
}
//
//class Rabbit: Jumpable {
//    override fun jump() {
//        println("jump")
//    }
//}

class Frog : Swimable,Jumpable {
    val jumpable: Jumpable = JumpabalImplement()
    val swimable: Swimable = SwimableImplement()

    override fun swim() {
        println("Frog is swim")
    }

    override fun jump() {
        println("frog is jump")
    }
}

/*
 Diamond problem :
               Animals
               /     \
             Fish  Kangaroo
                 \  /
                 Frog
 */


open class Animals: AnimalInterface {
    override fun animalName() {
        println("This is animals class")
    }
}
interface AnimalInterface {
    fun animalName()
}

class Fish: Swimable, Animals() {
    override fun swim() {
        println("fish is swim")
    }

    override fun animalName() {
        println("Animal is Fish")
    }

}

class Kangaroo:  Jumpable, Animals() {
    override fun jump() {
        println("Kangaroo is Jump")
    }

    override fun animalName() {
        println("Animal is kangaroo")
    }
}

class Frogs: Swimable, Jumpable {
    val jumpable: Jumpable = JumpabalImplement()
    val swimable: Swimable = SwimableImplement()
    val animalInterface: AnimalInterface = Animals()

    override fun swim() {
        println("frog is swim")
    }

    override fun jump() {
        println("frog is jump")
    }


}
//overriding

open class OverrideProperty {
    open val number: Int = 1
    open val today: String = " "
    var todaySkyColor: String = "Blue"
}

class Override: OverrideProperty() {
    override val number: Int = 4
    //we can override val to var.but not viceversa
    override var today: String = "Monday"

    val fillColor get() = super.todaySkyColor
}

open class Chair {
    fun sit() {
        println("Sit on chair")
    }
}

class Table: Chair() {

}


