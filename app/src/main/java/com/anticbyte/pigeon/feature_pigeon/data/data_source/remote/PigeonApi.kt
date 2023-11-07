package com.anticbyte.pigeon.feature_pigeon.data.data_source.remote

import com.anticbyte.pigeon.feature_pigeon.data.data_source.remote.dto.PigeonDto
import retrofit2.http.GET
import retrofit2.http.Path

interface PigeonApi {
    companion object {
        const val PIGEON_API = "https://jsonplaceholder.typicode.com"
    }

    @GET("/posts")
    suspend fun getAllNews(): List<PigeonDto>

    @GET("/posts/{post_id}")
    suspend fun getNews(
        @Path("post_id") newsId: Int
    ): PigeonDto
}