package com.rzs.apicatalogmx.data.repository

import com.rzs.apicatalogmx.data.data_source.GetApiDataService
import com.rzs.apicatalogmx.domain.model.PageModel
import com.rzs.apicatalogmx.domain.repository.ApiRepository
import retrofit2.Response
import javax.inject.Inject


class ApiRepositoryImpl @Inject constructor(
    private val service: GetApiDataService
): ApiRepository  {

    override suspend fun getApiCatalog(): Response<PageModel> {
        return service.getAllApis()
    }
}