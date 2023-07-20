package com.example.androidkotlin.ecommerce

fun main() {
    val buyer = Buyer()
    val seller = Seller()
    val productsList = mutableListOf<Product>()

    seller.addProduct(Product("keyboard", 3),productsList)
    seller.addProduct(Product("PC", 3),productsList)
    seller.addProduct(Product("Book", 5),productsList)
    seller.addProduct(Product("Car", 1),productsList)

    buyer.buyProduct("Car",productsList)
}
