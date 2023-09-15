package com.mynews.mynews.business.api

import com.mynews.mynews.utils.Constants.TOP_BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ApiService {
    fun createBusiness(): ApiClient {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(TOP_BASE_URL)
            .build()
        return retrofit.create(ApiClient::class.java)
    }
}