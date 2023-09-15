package com.mynews.mynews.data

import android.util.Log
import com.mynews.mynews.model.News
import com.mynews.mynews.topstories.api.ApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object DataSource {
    suspend fun loadTopNews(adapter: com.mynews.mynews.topstories.adapter.Adapter) {


        val apiCall = ApiService.create()

        val response = try {
            apiCall.getNews()
        } catch (e: Exception) {
            Log.e("NewsDatasource", e.message.toString())
            null
        }
        response?.let {
            withContext(Dispatchers.Main) {
                println("Data is ${it.numResults}")
                adapter.newsList = it.results
                adapter.notifyDataSetChanged()
            }
        }

    }

    suspend fun loadPopularNews(adapter: com.mynews.mynews.popular.adapter.Adapter) {
        val apiCall = com.mynews.mynews.popular.api.ApiService.createPopular()

        val response = try {
            apiCall.getPopularNews()
        } catch (e: Exception) {
            Log.e("PopNewsDatasource", e.message.toString())
            null
        }
        response?.let {
            withContext(Dispatchers.Main) {
                println("Data is ${it.numResults}")
                adapter.newsList = it.results
                adapter.notifyDataSetChanged()
            }
        }
    }

    suspend fun loadBusinessNews(adapter: com.mynews.mynews.business.adapter.Adapter) {
        val apiCall = com.mynews.mynews.business.api.ApiService.createBusiness()

        val response = try {
            apiCall.getBusinessNews()
        } catch (e: Exception) {
            Log.e("BusinessNewsDatasource", e.message.toString())
            null
        }
        response?.let {
            withContext(Dispatchers.Main) {
                println("Data is ${it.numResults}")
                adapter.newsList = it.results as List<News>
                adapter.notifyDataSetChanged()
            }
        }
    }

}