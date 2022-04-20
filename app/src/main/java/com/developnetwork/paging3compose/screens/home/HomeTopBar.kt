package com.developnetwork.paging3compose.screens.home

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.developnetwork.paging3compose.ui.theme.topAppBarBackgroundColor
import com.developnetwork.paging3compose.ui.theme.topAppBarContentColor

@Composable
fun HomeTopBar(
    onSearchClicked:() ->Unit
){
    TopAppBar(
        title = {Text(text = "Home", color = MaterialTheme.colors.topAppBarContentColor)},
        backgroundColor =   MaterialTheme.colors.topAppBarBackgroundColor,
        actions = {
            IconButton(onClick = onSearchClicked) {
                Icon(imageVector = Icons.Default.Search, contentDescription = "search icon")
            }
        }
    )
}

@Composable
@Preview
fun HomeTopBarPreview(){
    HomeTopBar {

    }
}