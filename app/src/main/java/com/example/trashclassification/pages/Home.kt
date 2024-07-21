package com.example.trashclassification.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun HomeScreen(modifier: Modifier = Modifier, navController: NavController, paddingValues: PaddingValues) {
    Box(modifier = modifier.padding(paddingValues)){
        Text(text = "HOME", modifier = modifier.align(Alignment.Center))
    }
}