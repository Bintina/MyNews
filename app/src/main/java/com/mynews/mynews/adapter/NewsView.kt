package com.mynews.mynews.adapter

import com.mynews.mynews.model.NewsItem

interface NewsView {
    fun showNews(news: MutableList<NewsItem?>)
    fun showError(e: Throwable)
}