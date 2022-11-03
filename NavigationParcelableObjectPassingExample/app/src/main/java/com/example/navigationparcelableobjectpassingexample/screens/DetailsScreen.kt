package com.example.navigationparcelableobjectpassingexample.screens

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavHostController
import com.example.navigationparcelableobjectpassingexample.SharedViewModel

@Composable
fun DetailsScreen(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    val person = sharedViewModel.person

    LaunchedEffect(key1 = person, block = {
        if (person != null)
            Log.d("DetailsScreen", "Person info: ${person?.firstName}, ${person?.lastName}")
    })

    Box(
        modifier = Modifier
            .fillMaxSize()
            .clickable {},
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Details",
            style = TextStyle(
                fontSize = MaterialTheme.typography.h3.fontSize,
                fontWeight = FontWeight.Bold
            )
        )
    }
}