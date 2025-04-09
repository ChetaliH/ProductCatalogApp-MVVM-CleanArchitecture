package com.example.productcatalogapp.domain.repository

import com.example.productcatalogapp.data.remote.dto.ProductDetailsDto
import com.example.productcatalogapp.data.remote.dto.ProductDto

interface ProductRepository {

    suspend fun getProducts() : List<ProductDto>
    suspend fun getProductById(id: String): ProductDetailsDto
}