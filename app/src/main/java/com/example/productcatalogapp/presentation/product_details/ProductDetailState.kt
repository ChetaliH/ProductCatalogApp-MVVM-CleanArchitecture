package com.example.productcatalogapp.presentation.product_detail

import com.example.productcatalogapp.domain.model.ProductDetail

data class ProductDetailState(
    val isLoading: Boolean = false,
    val productDetail: ProductDetail? = null,
    val error: String = ""
)