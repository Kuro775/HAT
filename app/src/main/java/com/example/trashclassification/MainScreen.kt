package com.example.trashclassification

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController


@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomBar(navController = navController)}
    ) {innerPadding ->
        NavGraph(
            navController = navController,
            modifier = modifier,
            paddingValues = innerPadding
        )
    }

//    Scaffold(
//        bottomBar = { BottomBar(navController = navController)}
//    ) {innerPadding ->
//        PreWelcomeScreen(
//            navController = navController,
//            modifier = modifier,
//            paddingValues = innerPadding
//        )
//    }
}

@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        NavItem.Home,
        NavItem.Camera,
        NavItem.Profile
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    NavigationBar {
        screens.forEach { screen ->
            AddItem(
                screen = screen,
                currentDestination = currentDestination,
                navController = navController
            )
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: NavItem,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    NavigationBarItem(
        label = {
            Text(text = screen.label)
        },
        icon = {
            Icon(
                imageVector = screen.icon,
                contentDescription = "Navigation Icon"
            )
        },
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } ?: false,
        onClick = {
            navController.navigate(screen.route)
        },
        alwaysShowLabel = false
    )
}

@Preview
@Composable
fun MainPreview (){
    MainScreen()
}