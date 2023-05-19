package com.example.androidkotlin.oldecommerce

class WarehouseController : Warehouse {


    override var availableProducts: MutableMap<String, Int> = mutableMapOf()
        get() = field
        set(value) {
            field = value
        }
    init {
        availableProducts = mutableMapOf()
    }

    override fun isAvailableProduct(productName: String) {
        val quantity = availableProducts[productName]
        if (quantity != null && quantity > 0) {
            println("product is available!")
        } else {
            println("product is not available!")
        }
    }

    override fun notifyToSeller(nameOfSoldProduct: String, notify: (String) -> Unit) {
        println("$nameOfSoldProduct is Sold...")
        notify.invoke(nameOfSoldProduct)
        println()
    }
}
