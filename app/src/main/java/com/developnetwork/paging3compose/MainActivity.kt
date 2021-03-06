package com.developnetwork.paging3compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.developnetwork.paging3compose.navigation.SetupNavGraph
import com.developnetwork.paging3compose.ui.theme.Paging3ComposeTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Paging3ComposeTheme {
                val navController= rememberNavController( )
                SetupNavGraph(navController = navController)
            }
        }
    }
}

