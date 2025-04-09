package com.example.productcatalogapp.data.repository

import com.example.productcatalogapp.data.remote.ProductApi
import com.example.productcatalogapp.data.remote.dto.ProductDetailsDto
import com.example.productcatalogapp.data.remote.dto.ProductDto
import com.example.productcatalogapp.domain.repository.ProductRepository
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val api: ProductApi
): ProductRepository{
    override suspend fun getProducts(): List<ProductDto> {
        return api.getProducts()
    }

    override suspend fun getProductById(id: String): ProductDetailsDto {
        return  api.getProductById(id)
    }
}