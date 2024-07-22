package com.example.trashclassification

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.trashclassification.composable.CameraPreview
import com.example.trashclassification.pages.HomeScreen
import com.example.trashclassification.pages.LoginScreen
import com.example.trashclassification.pages.PreWelcomeScreen
import com.example.trashclassification.pages.ProfileScreen
import com.example.trashclassification.pages.SignupScreen
import com.example.trashclassification.pages.WelcomeScreen


@Composable
fun NavGraph(navController: NavHostController, modifier: Modifier = Modifier, paddingValues: PaddingValues) {
    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        composable(route = NavItem.Home.route){
            HomeScreen( modifier = modifier, navController = navController, paddingValues = paddingValues)
        }
        composable(route = NavItem.Camera.route){
            CameraPreview()
        }
        composable(route = NavItem.Profile.route){
            ProfileScreen( modifier = modifier, navController = navController, paddingValues = paddingValues)
        }
        composable("pre_welcome"){
            PreWelcomeScreen( modifier = modifier, navController = navController, paddingValues = paddingValues)
        }
        composable("welcome"){
            WelcomeScreen( modifier = modifier, navController = navController, paddingValues = paddingValues)
        }
        composable("signup"){
            SignupScreen( modifier = modifier, navController = navController, paddingValues = paddingValues)
        }
        composable("login"){
            LoginScreen( modifier = modifier, navController = navController, paddingValues = paddingValues)
        }
    }
}