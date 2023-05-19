package com.example.androidkotlin.oldecommerce

class Ecommerce(
    private val buyer: Buyer,
    private val seller: Seller,
    private val warehouse: Warehouse
) {
    private val productsList: MutableList<Product> = mutableListOf()
    fun addProduct(product: Product) {
        productsList.add(product)
        warehouse.availableProducts =
            productsList.associate { it.nameOfProduct to it.stockOfProduct }.toMutableMap()
    }

    fun buyProduct(nameOfProductToBuy: String) {
        val product = productsList.find { it.nameOfProduct == nameOfProductToBuy && it.stockOfProduct > 0 }
        if (product != null) {
            buyer.buyRequest(nameOfProductToBuy, seller)
            seller.run { sellProduct(nameOfProductToBuy) }
            product.stockOfProduct--
            warehouse.availableProducts[nameOfProductToBuy] = product.stockOfProduct
        } else {
            println("$nameOfProductToBuy is not available for purchase")
        }
    }
}
