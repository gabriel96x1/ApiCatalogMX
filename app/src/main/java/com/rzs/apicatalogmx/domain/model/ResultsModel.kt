package com.rzs.apicatalogmx.domain.model

import com.google.gson.annotations.SerializedName

data class ResultsModel(
    @SerializedName("_id")
    var _id : String,
    @SerializedName("variables")
    var variables : List<String>,
    @SerializedName("count")
    var count : Int,
    @SerializedName("url")
    var url : String,
    @SerializedName("endpoint")
    var endpoint : String,
) {
}