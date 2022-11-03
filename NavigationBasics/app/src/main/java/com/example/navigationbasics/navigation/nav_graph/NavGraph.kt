package com.example.navigationbasics.navigation.nav_graph

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.navigationbasics.navigation.*
import com.example.navigationbasics.navigation.nav_graph.authNavGraph
import com.example.navigationbasics.navigation.nav_graph.homeNavGraph
import com.example.navigationbasics.screens.LoginScreen
import com.example.navigationbasics.screens.SignUpScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = HOME_GRAPH_ROUTE,
        route = ROOT_GRAPH_ROUTE
    ) {
        homeNavGraph(navController = navController)
        authNavGraph(navController = navController)
        // move to isolated homeNavGraph extension function of NavGraphBuilder
        /*composable(
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
        }*/

        // can be move to another extension function of the NavGraphBuilder
        /*navigation(
            startDestination = Screen.Login.route,
            route = AUTHENTICATION_ROUTE
        ) {
            composable(
                route = Screen.Login.route
            ) {
                LoginScreen(navController = navController)
            }

            composable(
                route = Screen.SignUp.route
            ) {
                SignUpScreen(navController = navController)
            }
        }*/
    }
}