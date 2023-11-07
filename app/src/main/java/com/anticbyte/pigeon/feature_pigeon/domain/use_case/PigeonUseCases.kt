package com.anticbyte.pigeon.feature_pigeon.domain.use_case

import javax.inject.Inject

data class PigeonUseCases @Inject constructor(
    val getAllNews: GetAllNews,
    val getNews: GetNews
)