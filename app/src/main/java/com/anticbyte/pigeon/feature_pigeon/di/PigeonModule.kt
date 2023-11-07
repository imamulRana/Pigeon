package com.anticbyte.pigeon.feature_pigeon.di

import com.anticbyte.pigeon.feature_pigeon.data.data_source.remote.PigeonApi
import com.anticbyte.pigeon.feature_pigeon.data.repository.PigeonRepositoryImpl
import com.anticbyte.pigeon.feature_pigeon.domain.repository.PigeonRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PigeonModule {
    @Provides
    @Singleton
    fun providePigeonRepository(pigeonApi: PigeonApi): PigeonRepository =
        PigeonRepositoryImpl(pigeonApi = pigeonApi)

    @Provides
    @Singleton
    fun providePigeonApi(): PigeonApi {
        return Retrofit.Builder()
            .baseUrl(PigeonApi.PIGEON_API)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PigeonApi::class.java)
    }
}