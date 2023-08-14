package com.mynews.mynews.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PopularResult(
    @SerialName("abstract")
    val popularAbstract: String?,
    @SerialName("adx_keywords")
    val popularAdxKeywords: String?,
    @SerialName("asset_id")
    val popularAssetId: Long?,
    @SerialName("byline")
    val popularByline: String?,
    @SerialName("column")
    val popularColumn: PopularAny?,
    @SerialName("des_facet")
    val popularDesFacet: List<String?>?,
    @SerialName("eta_id")
    val popularEtaId: Int?,
    @SerialName("geo_facet")
    val popularGeoFacet: List<String?>?,
    @SerialName("id")
    val popularId: Long?,
    @SerialName("media")
    val popularMedia: List<PopularMedia?>?,
    @SerialName("nytdsection")
    val popularNytdsection: String?,
    @SerialName("org_facet")
    val popularOrgFacet: List<String?>?,
    @SerialName("per_facet")
    val popularPerFacet: List<String?>?,
    @SerialName("published_date")
    val popularPublishedDate: String?,
    @SerialName("section")
    val popularSection: String?,
    @SerialName("source")
    val popularSource: String?,
    @SerialName("subsection")
    val popularSubsection: String?,
    @SerialName("title")
    val popularTitle: String?,
    @SerialName("type")
    val popularType: String?,
    @SerialName("updated")
    val popularUpdated: String?,
    @SerialName("uri")
    val popularUri: String?,
    @SerialName("url")
    val popularUrl: String?
)