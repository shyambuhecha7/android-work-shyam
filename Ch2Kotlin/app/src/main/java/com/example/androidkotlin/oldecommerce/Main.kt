package com.example.androidkotlin.oldecommerce

fun main() {
    val deliver = Deliver()
    val warehouse = WarehouseController()
    val seller = Seller(deliver,warehouse)
    val buyer = Buyer()


    val ecommerce = Ecommerce(buyer,seller,warehouse)
    ecommerce.addProduct(Product("keyboard",3))
    ecommerce.addProduct(Product("PC",3))
    ecommerce.addProduct(Product("Book",5))
    ecommerce.addProduct(Product("Car",1))

    buyer.buyRequest("Car",seller)
    ecommerce.buyProduct("Car")


   //warehouse.notifyToSeller("Car") {receiveData -> seller.sellProduct(receiveData)}









}