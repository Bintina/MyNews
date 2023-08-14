package com.mynews.mynews.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PopularMedia(
    @SerialName("approved_for_syndication")
    val popularApprovedForSyndication: Int?,
    @SerialName("caption")
    val popularCaption: String?,
    @SerialName("copyright")
    val popularCopyright: String?,
    @SerialName("media-metadata")
    val popularMediaMetadata: List<PopularMediaMetadata?>?,
    @SerialName("subtype")
    val popularSubtype: String?,
    @SerialName("type")
    val popularType: String?
)