package com.mynews.mynews.popular.api

import com.mynews.mynews.utils.Constants.POP_BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiService {
    fun createPopular(): ApiClient {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(POP_BASE_URL)
            .build()
        return retrofit.create(ApiClient::class.java)
    }
}