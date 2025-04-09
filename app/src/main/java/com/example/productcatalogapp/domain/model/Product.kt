package com.example.productcatalogapp.domain.model

import com.example.productcatalogapp.data.remote.dto.ProductDto

data class Product(
    val id: Int,
    val title: String,
    val price: Double,
    val description: String,
    val thumbnail: String
)

fun ProductDto.toProductList(): List<Product> {
    return products.map {
        Product(
            id = it.id,
            title = it.title,
            price=it.price,
            description = it.description,
            thumbnail = it.thumbnail
        )
    }
}