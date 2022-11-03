package com.example.navigationparcelableobjectpassingexample.screens

import com.example.navigationparcelableobjectpassingexample.models.Person
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavHostController
import com.example.navigationparcelableobjectpassingexample.SharedViewModel
import com.example.navigationparcelableobjectpassingexample.navigation.Screen

@Composable
fun HomeScreen(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .clickable {
                // first approach
                val person = Person(firstName = "John", lastName = "Doe")
                //navController.currentBackStackEntry?.savedStateHandle?.set(
                //    key = "person",
                //    value = person
                //)
                // if we do a popBackStack() here, we will send null to the details screen
                // it means like if we want to navigate to another screen and pop the current screen
                // from the backStack, the approach with currentBackStackEntry.savedStateHandle
                // is not going to work
                // navController.popBackStack()
                // second approach is shared a viewModel between multiple screens
                sharedViewModel.addPerson(newPerson = person)
                navController.navigate(Screen.Details.route)
            },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Home",
            style = TextStyle(
                fontSize = MaterialTheme.typography.h3.fontSize,
                fontWeight = FontWeight.Bold
            )
        )
    }
}