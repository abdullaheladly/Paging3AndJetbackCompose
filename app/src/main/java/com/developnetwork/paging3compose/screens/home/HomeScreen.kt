package com.developnetwork.paging3compose.screens.home

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.paging.ExperimentalPagingApi
import androidx.paging.compose.collectAsLazyPagingItems
import coil.annotation.ExperimentalCoilApi
import com.developnetwork.paging3compose.navigation.Screen
import com.developnetwork.paging3compose.screens.common.ListContent

@ExperimentalPagingApi
@ExperimentalCoilApi
@Composable
fun HomeScreen(navController: NavHostController,
    homeViewModel:HomeViewModel = hiltViewModel()
){
    val getAllImages=homeViewModel.getAllImages.collectAsLazyPagingItems()
    Scaffold(
        topBar = {
            HomeTopBar(onSearchClicked = {navController.navigate(Screen.Search.route)})
        }, content = {
            ListContent(items = getAllImages)
        }
    )

}