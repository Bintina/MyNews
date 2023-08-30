package com.mynews.mynews.api

import com.mynews.mynews.model.NewsResponse
import com.mynews.mynews.utils.Constants
import com.mynews.mynews.utils.Constants.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

object ApiService {
    fun create(): ApiClient {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
        return retrofit.create(ApiClient::class.java)
    }
}
