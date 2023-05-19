package com.example.androidkotlin.oldecommerce

class Seller(private val deliver: DeliverInterface,val warehouse: Warehouse) {

    fun sellProduct(nameOfSoldProduct: String) {
        println("Receive Data: $nameOfSoldProduct")
        deliver.productDeliverToBuyer()
    }
}