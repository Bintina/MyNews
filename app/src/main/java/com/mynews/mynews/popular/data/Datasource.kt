package com.mynews.mynews.popular.data

import android.util.Log
import com.mynews.mynews.model.News
import com.mynews.mynews.topstories.adapter.Adapter
import com.mynews.mynews.topstories.api.ApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object Datasource {
    suspend fun loadPopularNews(adapter: com.mynews.mynews.popular.adapter.Adapter) {
        val apiCall = com.mynews.mynews.popular.api.ApiService.createPopular()

        val response = try {
            apiCall.getPopularNews()
        } catch (e: Exception) {
            Log.e("PopNewsDatasource", e.message.toString())
            null
        }
        response?.let {
            withContext(Dispatchers.Main){
                println("Data is ${it.numResults}")
                adapter.popularNewsList = it.results
                adapter.notifyDataSetChanged()
            }
        }
    }
}