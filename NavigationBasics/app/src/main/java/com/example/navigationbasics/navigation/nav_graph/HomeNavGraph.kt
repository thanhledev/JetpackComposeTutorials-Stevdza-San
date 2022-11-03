package com.example.navigationbasics.navigation.nav_graph

import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.navArgument
import com.example.navigationbasics.screens.DetailScreen
import com.example.navigationbasics.screens.HomeScreen
import com.example.navigationbasics.navigation.DETAIL_ARGUMENT_KEY
import com.example.navigationbasics.navigation.DETAIL_ARGUMENT_KEY2
import com.example.navigationbasics.navigation.HOME_GRAPH_ROUTE
import com.example.navigationbasics.navigation.Screen

fun NavGraphBuilder.homeNavGraph(
    navController: NavController
) {
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_GRAPH_ROUTE
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController)
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                navArgument(DETAIL_ARGUMENT_KEY) {
                    type = NavType.IntType
                },
                navArgument(DETAIL_ARGUMENT_KEY2) {
                    type = NavType.StringType
                },
            )
        ) {
            Log.d("Args-Key1", it.arguments?.getInt(DETAIL_ARGUMENT_KEY).toString())
            Log.d("Args-Key2", it.arguments?.getString(DETAIL_ARGUMENT_KEY2).toString())
            DetailScreen(navController)
        }
    }
}