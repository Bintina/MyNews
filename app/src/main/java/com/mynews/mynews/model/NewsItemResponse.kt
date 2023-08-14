package com.mynews.mynews.model


import com.google.gson.annotations.SerializedName

data class NewsItemResponse(
    @SerializedName("copyright")
    val copyright: String,
    @SerializedName("last_updated")
    val lastUpdated: String,
    @SerializedName("num_results")
    val numResults: Int,
    @SerializedName("results")
    val results: List<NewsItem>,
    @SerializedName("section")
    val section: String,
    @SerializedName("status")
    val status: String
)