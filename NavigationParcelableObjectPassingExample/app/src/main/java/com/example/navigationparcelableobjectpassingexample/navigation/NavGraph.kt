package com.example.navigationparcelableobjectpassingexample.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navigationparcelableobjectpassingexample.SharedViewModel
import com.example.navigationparcelableobjectpassingexample.models.Person
import com.example.navigationparcelableobjectpassingexample.screens.DetailsScreen
import com.example.navigationparcelableobjectpassingexample.screens.HomeScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    val sharedViewModel: SharedViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navController, sharedViewModel = sharedViewModel)
        }
        composable(
            route = Screen.Details.route
        ) {
            val result = navController.previousBackStackEntry?.savedStateHandle?.get<Person>("person")
            //Log.d("DetailsScreen", "Person info: ${result?.firstName}, ${result?.lastName}")
            DetailsScreen(navController = navController, sharedViewModel = sharedViewModel)
        }
    }
}