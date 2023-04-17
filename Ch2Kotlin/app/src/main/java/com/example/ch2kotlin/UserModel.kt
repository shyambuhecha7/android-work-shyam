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


fun main() {
    val userModel = UserModel("User@123",1)
    println(userModel.username)
    println(userModel.profileImg)

    //Data classes and destructuring declarations

    val userID = StudentProfile("Shyam","Buhecha","Ahmdabad")
    //Creating two variables using  destructing declaration
    var(name,surname) = userID

    println("UserName: $name \n Surname: $surname")
}


val ss = StudentProfile(name = "s", surname = "dffds", city = "Fdsffdf")