package com.mynews.mynews.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PopularNewsItem(
    @SerialName("copyright")
    val popularCopyright: String?,
    @SerialName("num_results")
    val popularNumResults: Int?,
    @SerialName("results")
    val popularResults: List<PopularResult?>?,
    @SerialName("status")
    val popularStatus: String?
)