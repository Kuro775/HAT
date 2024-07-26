package com.example.trashclassification

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.trashclassification.pages.LoginScreen
import com.example.trashclassification.pages.PreWelcomeScreen
import com.example.trashclassification.pages.SignupScreen
import com.example.trashclassification.pages.WelcomeScreen

@Composable
fun MyAppNavigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "pre_welcome") {
        composable("pre_welcome"){
            PreWelcomeScreen(modifier = modifier, navController = navController)
        }
        composable("welcome"){
            WelcomeScreen(modifier = modifier, navController = navController)
        }
        composable("signup"){
            SignupScreen(modifier = modifier, navController = navController)
        }
        composable("login"){
            LoginScreen(modifier = modifier, navController = navController)
        }
    }
}