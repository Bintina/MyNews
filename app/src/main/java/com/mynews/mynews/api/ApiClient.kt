package com.mynews.mynews.api

import com.mynews.mynews.model.NewsItem
import com.mynews.mynews.model.NewsItems
import com.mynews.mynews.utils.Constants.END_URL_KEY
import retrofit2.http.GET

interface ApiClient {
    @GET(END_URL_KEY)
    suspend fun getNews(): NewsItems?
}