package com.example.productcatalogapp.domain.use_case.get_products
import android.net.http.HttpException
import android.os.Build
import androidx.annotation.RequiresExtension
import com.example.productcatalogapp.Common.Resource
import com.example.productcatalogapp.domain.model.Product
import com.example.productcatalogapp.domain.model.toProductList
import com.example.productcatalogapp.domain.repository.ProductRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import javax.inject.Inject

class GetProductsUseCase @Inject constructor(
    private val repository: ProductRepository
) {
    @RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
    operator fun invoke(): Flow<Resource<List<Product>>> = flow {
        try {
            emit(Resource.Loading())
            val products = repository.getProducts().flatMap { it.toProductList() }
            emit(Resource.Success(products))
        } catch(e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Please check your internet connection!"))
        }
    }
}