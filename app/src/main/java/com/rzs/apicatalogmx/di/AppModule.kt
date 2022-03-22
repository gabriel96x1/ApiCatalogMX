package com.rzs.apicatalogmx.di

import com.rzs.apicatalogmx.data.data_source.GetApiDataService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class AppModule {

    @Singleton
    @Provides
    fun provideRetrofitService(): GetApiDataService {
        return GetApiDataService.create()
    }
}