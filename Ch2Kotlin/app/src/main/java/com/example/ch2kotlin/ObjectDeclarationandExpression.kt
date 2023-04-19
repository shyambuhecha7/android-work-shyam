package com.example.ch2kotlin

class ObjectDeclarationandExpression {
}

fun main() {

    //anonymous object
    val User = object : UserProfile{
        val firstName: String = "Shyam"
        val lastName: String = "Buhecha"
        val userCity = "Ahamdabad"

        fun fullName() {
            println("$firstName $lastName")
        }

        //overriden in Interface function
        override fun userProfile() {
            println(" Name : $firstName \n Surname: $lastName \n City : $userCity")
        }
    }

    User.fullName()
    User.userProfile()

    //inherit
    val mango = object: Fruit("mango",180) {
        override fun fruitDetails() {
            super.fruitDetails()
        }
    }

    mango.fruitDetails()

    //Object Declaration
    Applikes.incrementLinkedinLikes()
    Applikes.incrementTwitterLikes()
    Applikes.incrementLinkedinLikes()
    println(Applikes.facebookLikes)
    println(Applikes.twitterLikes)
    println(Applikes.linkedinLikes)

    //inheritence
    Book.bookName()
    Book.readBook()

//    //data object
//    val myDataObj = MyDataObject
//    myDataObj.value


    //companion object
    val employee1 = WorkingProfetional("Raj")
    WorkingProfetional.company
    println(WorkingProfetional.company)
}

interface UserProfile {
    fun userProfile()
}

open class Fruit(val fruitName: String, val price: Int) {
   open fun fruitDetails() {
       println(" Fruit Name : $fruitName \n Fruit Price : $price")
   }
}

//Object Declaration

object Applikes {
    var facebookLikes = 0
    var twitterLikes = 0
    var linkedinLikes = 0

    fun incrementFacebookLikes() = facebookLikes++
    fun incrementTwitterLikes() = twitterLikes++
    fun incrementLinkedinLikes() = linkedinLikes++
    fun display() = println("Facebook : $facebookLikes \n Twitter : $twitterLikes \n Linkedin : $linkedinLikes")
}

open class Library(val bookName: String) {
    fun readBook() {
        println("i am read a book and it's name is $bookName ")
    }
}
object Book: Library("Magic of thinking big") {

    fun bookName(){
        println("Book Name : $bookName")
    }
}

//data object
//data object MyDataObject {
//    var value: Int = 10
//}

//campanion object
class WorkingProfetional(val name: String) {
    companion object CompanyName {
        val company: String = "Simform"
    }
}