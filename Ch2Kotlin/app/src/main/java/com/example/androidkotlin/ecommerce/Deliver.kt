package com.example.androidkotlin.ecommerce

class Deliver : DeliverInterface {
    override fun productDeliverToBuyer() {
        Thread.sleep(1500)
        println("Product delivered successfully")
    }
}