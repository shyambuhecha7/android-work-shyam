package com.example.androidkotlin.ecommerce

class Seller() {
    val deliver = Deliver()
    val warehouse = WarehouseController()
    fun addProduct(product: Product,productsList: MutableList<Product>) {
        productsList.add(product)
        warehouse.availableProducts = productsList.associate { it.nameOfProduct to it.stockOfProduct }.toMutableMap()
    }
    fun sellProduct(nameOfSoldProduct: String) {
        println("Received Data: $nameOfSoldProduct")
       deliver.productDeliverToBuyer()
    }
}