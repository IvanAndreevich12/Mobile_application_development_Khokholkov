package com.example.data

import com.example.data.api.model.ProductApi
import com.example.domain.Product
import com.example.domain.Repository


class RepositoryImpl : Repository {
    override suspend fun getProducts(): List<Product> {
        //return ProductClient.client.fetchProductList()
        return listOf(
            ProductApi(
                0,
                "dfgfdgsfgdfgsfgdfsdfg    f" +
                        "dgsfgdfgsfgdfsdfgfdgsfgdfgsfgdfsdfgfdgsfgdfgsfgdfsdfgfdgsfgdfgsfgdfs",
                56.4),
            ProductApi(
                1,
                "dfgfdgsfgdfgsfgdfsdfg    f" +
                        "dgsfgdfgsfgdfsdfgfdgsfgdfgsfgdfsdfgfdgsfgdfgsfgdfsdfgfdgsfgdfgsfgdfs",
                56.4))
    }
}
