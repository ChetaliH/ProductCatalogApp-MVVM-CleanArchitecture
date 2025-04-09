package com.example.productcatalogapp.presentation

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresExtension
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.productcatalogapp.presentation.product_detail.ProductDetailScreen
import com.example.productcatalogapp.presentation.product_list.ProductListScreen
import com.example.productcatalogapp.ui.theme.ProductCatalogAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProductCatalogAppTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screen.ProductList.route
                    ) {
                        composable(
                            route = Screen.ProductList.route
                        ) {
                            ProductListScreen(navController)
                        }
                        composable(
                            route = Screen.ProductDetail.route + "/{product.id}"
                        ) {
                            ProductDetailScreen(id)
                        }
                    }

                }
        }
    }
}}