package com.mynews.mynews.business.api

import com.mynews.mynews.business.model.BusinessResults
import com.mynews.mynews.utils.Constants.BUSINESS_END_URL
import retrofit2.http.GET

interface ApiClient {
    @GET(BUSINESS_END_URL)
    suspend fun getBusinessNews(): BusinessResults?
}