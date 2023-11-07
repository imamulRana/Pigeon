package com.anticbyte.pigeon.feature_pigeon.domain.repository

import com.anticbyte.pigeon.feature_pigeon.data.data_source.remote.dto.PigeonDto
import com.anticbyte.pigeon.feature_pigeon.domain.model.News

interface PigeonRepository {
    suspend fun getAllNews(): List<PigeonDto>

    suspend fun getNews(newsId: Int): News
}