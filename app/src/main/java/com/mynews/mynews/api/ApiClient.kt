package com.mynews.mynews.api

import com.mynews.mynews.model.NewsItems
import com.mynews.mynews.utils.Constants.END_URL
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiClient {
    @GET(END_URL)
    suspend fun getNews(@Query("api_key") apiKey: String): NewsItems?
}