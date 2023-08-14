package com.mynews.mynews.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PopularMediaMetadata(
    @SerialName("format")
    val popularFormat: String?,
    @SerialName("height")
    val popularHeight: Int?,
    @SerialName("url")
    val popularUrl: String?,
    @SerialName("width")
    val popularWidth: Int?
)