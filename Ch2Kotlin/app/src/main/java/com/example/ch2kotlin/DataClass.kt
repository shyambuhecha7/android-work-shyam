package com.example.ch2kotlin

data class UserModel(var username: String, var profileImg: Int) {

}
//data class with defalult value
data class WithDefaultValue(var id: Int = 1, val name: String = "Shyam") {

}
//property declare in class body
class ProfileModel(val name: String) {
    var userImg: Int = 0
}

data class StudentProfile(val name: String,val surname: String, val city: String) {

}
data class Person1(val name: String, val age: Int) {

}

fun main() {
    val userModel = UserModel("User@123",1)
    println(userModel.username)
    println(userModel.profileImg)

    //Data classes and destructuring declarations

    val userID = StudentProfile("Shyam","Buhecha","Ahmdabad")
    //Creating two variables using  destructing declaration
    var(name,surname) = userID

    println("UserName: $name \n Surname: $surname")

    //copy()
    val person1 = Person1("Shyam",21)
    //the copy() function is a built-in function that is used to create
    // a new object that is a copy of the original object with some
    // or all of its properties modified.
    val person2 = person1.copy("Raj")
    println("name : ${person2.name} age : ${person2.age}")
    //component
    println(person1.component1())
    println(person1.component2())

    //
    val person3 = Person1("Shyam",21)
    println(person1 === person3)




}


