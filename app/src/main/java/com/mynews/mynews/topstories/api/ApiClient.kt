package com.mynews.mynews.topstories.api

import com.mynews.mynews.topstories.model.NewsResponse
import com.mynews.mynews.utils.Constants
import retrofit2.http.GET

interface ApiClient {
    @GET(Constants.END_URL_KEY)
    suspend fun getNews(): NewsResponse
}