package com.example.productcatalogapp.data.remote

import com.example.productcatalogapp.data.remote.dto.ProductDetailsDto
import com.example.productcatalogapp.data.remote.dto.ProductDto
import retrofit2.http.GET
import retrofit2.http.Path

interface ProductApi {

    @GET("/docs/products")
    suspend fun getProducts(): List<ProductDto>

    @GET("/docs/products/{id}")
    suspend fun getProductById(@Path("id") id: String): ProductDetailsDto
}