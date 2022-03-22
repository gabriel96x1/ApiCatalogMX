package com.rzs.apicatalogmx.domain.model

import com.google.gson.annotations.SerializedName

data class PaginationModel(
    @SerializedName("pageSize")
    var pageSize : Int,
    @SerializedName("page")
    var page : Int,
    @SerializedName("total")
    var total : Int,
) {
}