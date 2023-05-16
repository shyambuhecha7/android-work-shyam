package com.example.androidkotlin.ecommerce

class Seller(private val deliver: DeliverInterface,val warehouse: Warehouse) : DeliverInterface by deliver {
}