package com.mynews.mynews.api.popular

import com.mynews.mynews.model.NewsItemResponse
import com.mynews.mynews.model.PopularNewsItems
import com.mynews.mynews.utils.Constants
import retrofit2.http.GET

interface PopularApiClient {
    @GET(Constants.POPULAR_END_URL)
    suspend fun getPopularNews(): PopularNewsItems?
}