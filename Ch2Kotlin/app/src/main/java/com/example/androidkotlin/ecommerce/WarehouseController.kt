package com.example.androidkotlin.ecommerce

class WarehouseController : Warehouse {

    override var availableProducts: MutableMap<String, Int> = mutableMapOf()
    override fun isAvailableProduct(productName: String) {
        val quantity = availableProducts[productName]
        if (quantity != null && quantity > 0) {
            println("Product is available!")
        } else {
            println("Product is not available!")
        }
    }

    override fun notifyToSeller(nameOfSoldProduct: String, notify: (String) -> Unit) {
        println("$nameOfSoldProduct is sold...")
        notify.invoke(nameOfSoldProduct)
        println()
    }
}