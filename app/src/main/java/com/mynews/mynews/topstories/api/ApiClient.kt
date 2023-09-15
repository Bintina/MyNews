package com.mynews.mynews.topstories.api

import com.mynews.mynews.model.NewsResponse
import com.mynews.mynews.utils.Constants
import retrofit2.http.GET

interface ApiClient {
    @GET(Constants.TOP_END_URL)
    suspend fun getNews(): NewsResponse
}