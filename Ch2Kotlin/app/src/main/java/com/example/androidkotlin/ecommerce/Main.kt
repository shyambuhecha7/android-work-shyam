package com.example.androidkotlin.ecommerce

class Main {
}

fun main() {
    val deliver = Deliver()
    val warehouse = WarehouseController()
    val seller = Seller(deliver,warehouse)
    val buyer = Buyer()

    val ecommerce = Ecommerce(buyer,seller,warehouse)
    ecommerce.buyer.buyRequest("keyboard", seller)
}