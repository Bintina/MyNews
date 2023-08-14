package com.mynews.mynews.model



import com.google.gson.annotations.SerializedName

data class PopularNewsItems(
    @SerializedName("copyright")
    val popularCopyright: String?,
    @SerializedName("num_results")
    val popularNumResults: Int?,
    @SerializedName("results")
    val popularResults: List<PopularResult?>?,
    @SerializedName("status")
    val popularStatus: String?
)