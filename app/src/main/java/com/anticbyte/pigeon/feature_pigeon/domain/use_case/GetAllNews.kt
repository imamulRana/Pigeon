package com.anticbyte.pigeon.feature_pigeon.domain.use_case

import com.anticbyte.pigeon.feature_pigeon.domain.model.News
import com.anticbyte.pigeon.feature_pigeon.domain.repository.PigeonRepository
import javax.inject.Inject

class GetAllNews @Inject constructor(
    private val pigeonRepository: PigeonRepository
) {
    suspend operator fun invoke(): List<News> = pigeonRepository.getAllNews().map { it.toNews() }
}

