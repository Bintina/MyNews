package com.mynews.mynews.business.data

import android.util.Log
import com.mynews.mynews.business.adapter.Adapter
import com.mynews.mynews.business.api.ApiService
import com.mynews.mynews.business.model.BusinessNews
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object Datasource {
    suspend fun loadBusinessNews(adapter: Adapter) {
        val apiCall = ApiService.createBusiness()

        val response = try {
            apiCall.getBusinessNews()
        } catch (e: Exception){
            Log.e("BusinessNewsDatasource", e.message.toString())
            null
        }
        response?.let{
            withContext(Dispatchers.Main){
                println("Data is ${it.num_results}")
                adapter.businessNewsList = (it.results as List<BusinessNews>?)!!
                adapter.notifyDataSetChanged()
            }
        }
    }
}