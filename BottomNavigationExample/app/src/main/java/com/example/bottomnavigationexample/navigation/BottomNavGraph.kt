package com.example.bottomnavigationexample.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bottomnavigationexample.screens.HomeScreen
import com.example.bottomnavigationexample.screens.ProfileScreen
import com.example.bottomnavigationexample.screens.SettingsScreen

@Composable
fun BottomNavGraph (
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(
            route = BottomBarScreen.Home.route
        ) {
            HomeScreen()
        }
        composable(
            route = BottomBarScreen.Profile.route
        ) {
            ProfileScreen()
        }
        composable(
            route = BottomBarScreen.Settings.route
        ) {
            SettingsScreen()
        }
    }
}