package com.example.androidkotlin.oldecommerce

class Deliver: DeliverInterface {
    override fun productDeliverToBuyer() {
        Thread.sleep(1500)
        println("product deliver successfully")
    }
}