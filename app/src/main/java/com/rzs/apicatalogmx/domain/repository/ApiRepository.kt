package com.rzs.apicatalogmx.domain.repository

import kotlinx.coroutines.flow.Flow

interface ApiRepository {
    suspend fun getApiCatalog(): Flow<List<String>>
}