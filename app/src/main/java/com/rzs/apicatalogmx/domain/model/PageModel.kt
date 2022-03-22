package com.rzs.apicatalogmx.domain.model

import com.google.gson.annotations.SerializedName

data class PageModel(
    @SerializedName("pagination")
    var pagination : PaginationModel,
    @SerializedName("results")
    var results : List<ResultsModel>
) {
}