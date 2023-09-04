package com.mynews.mynews.business.model

data class BusinessResults(
    val copyright: String?,
    val last_updated: String?,
    val num_results: Int?,
    val results: List<BusinessNews?>?,
    val section: String?,
    val status: String?
)