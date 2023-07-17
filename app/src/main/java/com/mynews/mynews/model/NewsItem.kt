package com.mynews.mynews.model

import com.google.gson.annotations.SerializedName

class NewsItem(
    @SerializedName("multimedia")
    val newsImage: String,
    @SerializedName("subsection")
    val newsLocation: String,
    @SerializedName("created_date")
    val newsDate: String,
    @SerializedName("title")
    val newsCaption: String
) {
}