package com.mynews.mynews.api

import com.mynews.mynews.model.NewsItem
import com.mynews.mynews.model.NewsItems
import com.mynews.mynews.utils.Constants.END_URL
import retrofit2.http.GET

object ApiClient {
    @GET(END_URL)
    suspend fun getNews(): List<NewsItem>
}