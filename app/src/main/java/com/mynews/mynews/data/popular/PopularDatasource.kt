package com.mynews.mynews.data.popular

import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.mynews.mynews.adapter.Adapter
import com.mynews.mynews.adapter.popular.PopularAdapter
import com.mynews.mynews.api.ApiService
import com.mynews.mynews.api.popular.PopularApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

object PopularDatasource {
    fun loadPopularNews(activity: AppCompatActivity, adapter: PopularAdapter) {

        val apiCall = PopularApiService.createPopular()

        activity.lifecycleScope.launch(Dispatchers.IO) {
            val response = try {
                apiCall.getPopularNews()
            } catch (e: Exception) {
                Log.e("PopularNewsDatasource", e.message.toString())
                null
            }
            response?.popularResults?.let {
                withContext(Dispatchers.Main){
                    adapter.popularNewsList = it
                    adapter.notifyDataSetChanged()
                }
            }

        }

    }
}