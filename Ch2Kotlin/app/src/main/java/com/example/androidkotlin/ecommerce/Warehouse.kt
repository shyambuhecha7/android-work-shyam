package com.example.androidkotlin.ecommerce

interface Warehouse {

    fun isAvailableProduct(product: String)

    fun notifyToSeller()
}