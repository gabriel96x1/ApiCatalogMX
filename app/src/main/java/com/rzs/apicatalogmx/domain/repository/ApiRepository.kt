package com.rzs.apicatalogmx.domain.repository

import com.rzs.apicatalogmx.domain.model.PageModel
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface ApiRepository {
    suspend fun getApiCatalog(): Response<PageModel>
}