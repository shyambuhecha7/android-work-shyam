package com.example.androidkotlin.ecommerce

class Buyer {
    fun buyRequest(productName: String,seller: Seller) {
        seller.warehouse.isAvailableProduct(productName)
    }
}
