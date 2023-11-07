package com.anticbyte.pigeon.feature_pigeon.domain.use_case

import com.anticbyte.pigeon.feature_pigeon.domain.repository.PigeonRepository
import javax.inject.Inject

class GetNews @Inject constructor(private val pigeonRepository: PigeonRepository) {
    suspend operator fun invoke(newsId: Int) = pigeonRepository.getNews(newsId)

}