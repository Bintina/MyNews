package com.mynews.mynews.api

import com.mynews.mynews.utils.Constants.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ApiService {
<<<<<<< Updated upstream:app/src/main/java/com/mynews/mynews/api/ApiService.kt
    fun create(): ApiClient {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
        return retrofit.create(ApiClient::class.java)
    }
}
=======
}
>>>>>>> Stashed changes:app/src/main/java/com/mynews/mynews/topstories/api/ApiService.kt
