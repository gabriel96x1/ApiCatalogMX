package com.rzs.apicatalogmx.data.repository

import com.rzs.apicatalogmx.domain.repository.ApiRepository
import kotlinx.coroutines.flow.Flow

class ApiRepositoryImpl : ApiRepository{

    override suspend fun getApiCatalog(): Flow<List<String>> {
        TODO("Not yet implemented")

    }
}