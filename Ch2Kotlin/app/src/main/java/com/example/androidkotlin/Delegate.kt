package com.example.androidkotlin

interface  Nurse{
    fun goAndBuyMedicine()
}

class Doctor(private val nurse: Nurse): Nurse by nurse{

}
class NurseImpl: Nurse {
    override fun goAndBuyMedicine() {
        println("give medicine list to nurse")
    }
}



//2.shop keeper take items and notify to warehouse

interface NotificationManager {
    fun notifyToWarehouse()
}
class NotificationManagerImpl : NotificationManager {
    override fun notifyToWarehouse() {
        println("send notification to warehouse")
    }
}

class Shopkeeper(private val notificationManager: NotificationManager) : NotificationManager by notificationManager {

}

fun main() {

    val notificationManager = NotificationManagerImpl()
    Shopkeeper(notificationManager).notifyToWarehouse()
    //
    //doctor->nurse->medical
    val nurse = NurseImpl()
    val doctor = Doctor(nurse)
    doctor.goAndBuyMedicine()


}