package com.anticbyte.pigeon.feature_pigeon.presentation.home

import com.anticbyte.pigeon.feature_pigeon.domain.model.News

data class HomeUiState(
    val status: Boolean = true,
    val news: List<News> = emptyList()
)
