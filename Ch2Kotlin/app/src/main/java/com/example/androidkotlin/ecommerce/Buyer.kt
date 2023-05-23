package com.example.androidkotlin.ecommerce

class Buyer {
    val warehouse = WarehouseController()
    private val seller = Seller()

    fun buyProduct(nameOfProductToBuy: String,productsList : MutableList<Product>) {
        val product =
            productsList.find { it.nameOfProduct == nameOfProductToBuy && it.stockOfProduct > 0 }
        if (product != null) {
            warehouse.isAvailableProduct(nameOfProductToBuy)
            seller.run {
                sellProduct(nameOfProductToBuy)
            }
            product.stockOfProduct --
            warehouse.availableProducts[nameOfProductToBuy] = product.stockOfProduct
        } else {
            println("$nameOfProductToBuy is not available for purchase")
        }
    }

}
