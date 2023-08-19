package com.example.gurjot.movieexplorer.data.local.model

import com.google.gson.annotations.SerializedName

/**
 * @author Gurjot Singh.
 */
data class TrailersResponse (

    @SerializedName("results")
    var trailers: List<Trailer>? = null
)
