package com.example.talk.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.talk.presentation.screen.auth.AuthScreen

@Composable
fun SetupNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "auth_screen") {

        composable(route = "auth_screen") {
            AuthScreen(navController = navController)
        }

    }
}