package com.example.productcatalogapp.domain.model
import com.example.productcatalogapp.data.remote.dto.ProductDetailsDto

data class ProductDetail(
    val id: Int,
    val title: String,
    val description: String,
    val category: String,
    val price: Double,
    val rating: Double,
    val images: List<String>
)

fun ProductDetailsDto.toProductDetail(): ProductDetail {
    return ProductDetail(
        id = id,
        title = title,
        description = description,
        category = category,
        price = price,
        rating = rating,
        images = images
    )
}
