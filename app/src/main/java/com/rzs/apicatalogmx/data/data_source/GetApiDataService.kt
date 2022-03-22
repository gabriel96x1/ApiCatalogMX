package com.rzs.apicatalogmx.data.data_source

import com.rzs.apicatalogmx.domain.model.PageModel
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface GetApiDataService {

    @GET("api-catalog")
    suspend fun getAllApis() : Response<PageModel>

    companion object{
        private val BASE_URL = "https://api.datos.gob.mx/v1/"

        fun create(): GetApiDataService {
            val logger = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BASIC }

            val client = OkHttpClient.Builder()
                .addInterceptor(logger)
                .build()

            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(GetApiDataService::class.java)
        }
    }

}
