package com.example.productcatalogapp.data.remote.dto

data class ReviewX(
    val comment: String,
    val date: String,
    val rating: Int,
    val reviewerEmail: String,
    val reviewerName: String
)