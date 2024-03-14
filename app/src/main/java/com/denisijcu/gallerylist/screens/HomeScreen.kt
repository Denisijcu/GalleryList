package com.denisijcu.gallerylist.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController


@Composable
fun HomeScreen(navController: NavHostController) {
    Column {
        GalleryScreen(navController = navController)
    }
}