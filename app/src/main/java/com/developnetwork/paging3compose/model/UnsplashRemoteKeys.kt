package com.developnetwork.paging3compose.model

import androidx.room.Entity
import androidx.room.PrimaryKey

data class UnsplashRemoteKeys(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val prevPage: Int?,
    val nextPage: Int?
)