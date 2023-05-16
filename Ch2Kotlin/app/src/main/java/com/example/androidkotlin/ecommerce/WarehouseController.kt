package com.example.androidkotlin.ecommerce

class WarehouseController: Warehouse {

    private var productList =
        mapOf("keyboard" to 1200,"Bottle" to 900,"pen" to 10)

    override fun isAvailableProduct(product: String) {
        if (productList.containsKey(product)) {
            println("Product is Not Available...")
        } else {
            notifyToSeller()
        }
    }

    override fun notifyToSeller() {
       println("product is Available. Deliver to Buyer")
    }
}