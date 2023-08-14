package com.mynews.mynews.model


import com.google.gson.annotations.SerializedName

data class PopularMediaMetadata(
    @SerializedName("format")
    val popularFormat: String?,
    @SerializedName("height")
    val popularHeight: Int?,
    @SerializedName("url")
    val popularUrl: String?,
    @SerializedName("width")
    val popularWidth: Int?
)