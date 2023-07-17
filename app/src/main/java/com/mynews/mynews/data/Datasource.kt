package com.mynews.mynews.data

import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.mynews.mynews.adapter.Adapter
import com.mynews.mynews.api.ApiClient
import com.mynews.mynews.api.ApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

object Datasource {
    fun loadNews(activity: AppCompatActivity, adapter: Adapter) {

        val apiCall = ApiService.create()

        activity.lifecycleScope.launch(Dispatchers.IO) {
            val response = try {
                apiCall.getNews()
            } catch (e: Exception) {
                Log.e("NewsDatasource", e.message.toString())
                null
            }
            response?.let {
                withContext(Dispatchers.Main) {
                    adapter.newsList = it.items
                    adapter.notifyDataSetChanged()
                }
            }
        }

    }
}