package com.example.productcatalogapp.data.remote.dto

data class ProductDto(
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int
)