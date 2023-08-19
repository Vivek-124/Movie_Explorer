package com.example.gurjot.movieexplorer.data.local.model

import com.google.gson.annotations.SerializedName

/**
 * @author Gurjot Singh
 * @since 11/13/2018.
 */
data class ReviewsResponse (

    @SerializedName("results")
    var reviews: List<Review>? = null
)
