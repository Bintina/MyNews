package com.mynews.mynews.popular.model

data class PopularNewsResult(
    val copyright: String?,
    val num_results: Int?,
    val results: List<PopularNews?>?,
    val status: String?
)