package com.example.jacksoncollection.base.domain.response


import com.google.gson.annotations.SerializedName

data class JacksonCollectionResponse(
    @SerializedName("resultCount")
    val resultCount: Int?,
    @SerializedName("results")
    val results: ArrayList<Album>?
)