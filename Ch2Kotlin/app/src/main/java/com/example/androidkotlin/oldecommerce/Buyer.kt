package com.example.androidkotlin.oldecommerce

class Buyer {
    fun buyRequest(productName: String, seller: Seller) {
        seller.warehouse.isAvailableProduct(productName)
    }


}
