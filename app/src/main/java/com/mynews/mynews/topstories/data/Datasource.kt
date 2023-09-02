package com.mynews.mynews.topstories.data

import android.util.Log
import com.mynews.mynews.topstories.adapter.Adapter
import com.mynews.mynews.topstories.api.ApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object Datasource {
    suspend fun loadNews(adapter: Adapter) {

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
}