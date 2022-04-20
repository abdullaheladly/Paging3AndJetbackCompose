package com.developnetwork.paging3compose.data.repository

import androidx.paging.*
import com.developnetwork.paging3compose.data.local.UnsplashDatabase
import com.developnetwork.paging3compose.data.paging.UnsplashRemoteMediator
import com.developnetwork.paging3compose.data.remote.UnsplashApi
import com.developnetwork.paging3compose.model.UnsplashImage
import com.developnetwork.paging3compose.utils.Constants.ITEMS_PER_PAGE
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ExperimentalPagingApi
class Repository @Inject constructor(
    private val unsplashApi: UnsplashApi,
    private val unsplashDatabase: UnsplashDatabase
) {
    fun getAllImages():Flow<PagingData<UnsplashImage>>{
        val pagingSourceFactory={unsplashDatabase.unsplashImageDao().getAllImages()}
        return Pager(
            config = PagingConfig(pageSize = ITEMS_PER_PAGE),
            remoteMediator = UnsplashRemoteMediator(
                unsplashApi = unsplashApi,
                unsplashDatabase = unsplashDatabase
            ),
            pagingSourceFactory = pagingSourceFactory
        ).flow
    }
}