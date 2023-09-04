package com.mynews.mynews.popular.api

import com.mynews.mynews.popular.model.PopularNewsResult
import com.mynews.mynews.utils.Constants.POP_END_URL
import retrofit2.http.GET

interface ApiClient {
    @GET(POP_END_URL)
    suspend fun getPopularNews(): PopularNewsResult?
}