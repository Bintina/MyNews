package com.mynews.mynews.model


import com.google.gson.annotations.SerializedName




data class PopularResult(
    @SerializedName("abstract")
    val popularAbstract: String?,
    @SerializedName("adx_keywords")
    val popularAdxKeywords: String?,
    @SerializedName("asset_id")
    val popularAssetId: Long?,
    @SerializedName("byline")
    val popularByline: String?,
    @SerializedName("column")
    val popularColumn: Any?,
    @SerializedName("des_facet")
    val popularDesFacet: List<String?>?,
    @SerializedName("eta_id")
    val popularEtaId: Int?,
    @SerializedName("geo_facet")
    val popularGeoFacet: List<String?>?,
    @SerializedName("id")
    val popularId: Long?,
    @SerializedName("media")
    val popularMedia: List<PopularMedia?>?,
    @SerializedName("nytdsection")
    val popularNytdsection: String?,
    @SerializedName("org_facet")
    val popularOrgFacet: List<String?>?,
    @SerializedName("per_facet")
    val popularPerFacet: List<String?>?,
    @SerializedName("published_date")
    val popularPublishedDate: String?,
    @SerializedName("section")
    val popularSection: String?,
    @SerializedName("source")
    val popularSource: String?,
    @SerializedName("subsection")
    val popularSubsection: String?,
    @SerializedName("title")
    val popularTitle: String?,
    @SerializedName("type")
    val popularType: String?,
    @SerializedName("updated")
    val popularUpdated: String?,
    @SerializedName("uri")
    val popularUri: String?,
    @SerializedName("url")
    val popularUrl: String?
)