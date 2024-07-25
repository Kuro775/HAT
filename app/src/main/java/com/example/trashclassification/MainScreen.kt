package com.example.trashclassification

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.trashclassification.composable.BottomBar
import com.example.trashclassification.ui.theme.TrashClassificationTheme

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    val navBackStackEntry by navController.currentBackStackEntryAsState()

    val bottomBarState = rememberSaveable{
        mutableStateOf(true)
    }

    when(navBackStackEntry?.destination?.route) {
        NavItem.Home.route, NavItem.Camera.route, NavItem.Profile.route -> {
            bottomBarState.value = true
        }
        else -> {
            bottomBarState.value = false
        }
    }
    TrashClassificationTheme {
        Scaffold(
            bottomBar = { BottomBar(navController = navController, bottomBarState = bottomBarState)}
        ) {innerPadding ->
            NavGraph(
                navController = navController,
                modifier = modifier,
                paddingValues = innerPadding
            )
        }
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

@Preview
@Composable
fun MainPreview (){
    MainScreen()
}