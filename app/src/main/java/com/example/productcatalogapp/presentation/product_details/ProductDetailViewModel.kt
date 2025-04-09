package com.example.productcatalogapp.presentation.product_detail

import android.os.Build
import androidx.annotation.RequiresExtension
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.productcatalogapp.Common.Constants
import com.example.productcatalogapp.Common.Resource
import com.example.productcatalogapp.domain.use_case.get_details.GetDetailsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
@HiltViewModel
class ProductDetailViewModel @Inject constructor(
    private val getDetailsUseCase: GetDetailsUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _state = mutableStateOf(ProductDetailState())
    val state: State<ProductDetailState> = _state

    init {
        savedStateHandle.get<String>(Constants.PARAM_PRODUCT_ID)?.let { productId ->
            getProductDetail(productId)
        }
    }

    @RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
    private fun getProductDetail(productId: String) {
        getDetailsUseCase(productId).onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = ProductDetailState(productDetail = result.data)
                }
                is Resource.Error -> {
                    _state.value = ProductDetailState(
                        error = result.message ?: "An unexpected error occurred"
                    )
                }
                is Resource.Loading -> {
                    _state.value = ProductDetailState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }


}