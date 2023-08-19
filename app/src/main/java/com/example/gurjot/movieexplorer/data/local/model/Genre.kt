package com.example.gurjot.movieexplorer.data.local.model

import com.google.gson.annotations.SerializedName

/**
 * @author Gurjot Singh
 * @since 11/20/2018.
 */
data class Genre (

    @SerializedName("id")
    var id: Int = 0,

    @SerializedName("name")
    var name: String? = null
)
