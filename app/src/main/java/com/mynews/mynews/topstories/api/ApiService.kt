package com.mynews.mynews.topstories.api

import com.mynews.mynews.utils.Constants.TOP_BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiService {
    fun create(): ApiClient {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(TOP_BASE_URL)
            .build()
        return retrofit.create(ApiClient::class.java)
    }
}
