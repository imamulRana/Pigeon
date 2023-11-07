package com.anticbyte.pigeon.feature_pigeon.data.repository

import com.anticbyte.pigeon.feature_pigeon.data.data_source.remote.PigeonApi
import com.anticbyte.pigeon.feature_pigeon.data.data_source.remote.dto.PigeonDto
import com.anticbyte.pigeon.feature_pigeon.domain.model.News
import com.anticbyte.pigeon.feature_pigeon.domain.repository.PigeonRepository
import retrofit2.HttpException
import javax.inject.Inject

class PigeonRepositoryImpl @Inject constructor(
    private val pigeonApi: PigeonApi
) : PigeonRepository {
    override suspend fun getAllNews(): List<PigeonDto> {
        return pigeonApi.getAllNews()
    }

    override suspend fun getNews(newsId: Int): News {
        return try {
            pigeonApi.getNews(newsId).toNews()
        } catch (_: HttpException) {
            News()
        }

    }
}