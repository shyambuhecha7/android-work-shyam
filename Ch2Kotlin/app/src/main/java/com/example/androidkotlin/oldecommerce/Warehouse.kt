package com.example.androidkotlin.oldecommerce

interface Warehouse {
    var availableProducts: MutableMap<String, Int>

    fun isAvailableProduct(productName: String)

    fun notifyToSeller(nameOfSoldProduct: String, notify: (String) -> Unit)
}
