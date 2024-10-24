package org.kmpmovies.project

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.*
import coil3.ImageLoader
import coil3.compose.setSingletonImageLoaderFactory
import coil3.request.crossfade
import coil3.util.DebugLogger
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.kmpmovies.project.ui.screens.detail.DetailScreen

import org.kmpmovies.project.ui.screens.home.HomeScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun App() {
    setSingletonImageLoaderFactory { context ->
        ImageLoader.Builder(context)
            .crossfade(true)
            .logger(DebugLogger())
            .build()
    }
//    HomeScreen()
    DetailScreen()
}

