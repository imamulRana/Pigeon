package com.anticbyte.pigeon.feature_pigeon.data.data_source.remote.dto

import com.anticbyte.pigeon.feature_pigeon.domain.model.News

data class PigeonDto(
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
) {
    fun toNews(): News = News(id = this.id, newsTitle = this.title, newsBody = this.body)
}
