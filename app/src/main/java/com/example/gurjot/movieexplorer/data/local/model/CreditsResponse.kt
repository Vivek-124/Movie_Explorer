package com.example.gurjot.movieexplorer.data.local.model

import com.google.gson.annotations.SerializedName

/**
 * @author Gurjot Singh
 * @since 11/12/2018.
 */
data class CreditsResponse (

    @SerializedName("cast")
    var cast: List<Cast>? = null
)
