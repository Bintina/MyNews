package com.mynews.mynews.api.popular

import com.mynews.mynews.api.ApiClient
import com.mynews.mynews.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object PopularApiService {
    fun createPopular(): PopularApiClient {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(Constants.POPULAR_BASE_URL)
            .build()
        return retrofit.create(PopularApiClient::class.java)
    }
}