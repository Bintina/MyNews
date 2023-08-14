package com.mynews.mynews.model



import com.google.gson.annotations.SerializedName



data class PopularMedia(
    @SerializedName("approved_for_syndication")
    val popularApprovedForSyndication: Int?,
    @SerializedName("caption")
    val popularCaption: String?,
    @SerializedName("copyright")
    val popularCopyright: String?,
    @SerializedName("media-metadata")
    val popularMediaMetadata: List<PopularMediaMetadata?>?,
    @SerializedName("subtype")
    val popularSubtype: String?,
    @SerializedName("type")
    val popularType: String?
)