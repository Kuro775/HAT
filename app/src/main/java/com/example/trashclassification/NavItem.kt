package com.example.trashclassification

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavItem(
    val label : String,
    val route: String,
    val icon: ImageVector
) {
    object Home :
            NavItem(
                "Home",
                "home",
                Icons.Default.Home
            )

    object Camera :
        NavItem(
            "Camera",
            "camera",
            Icons.Default.Favorite
        )

    object Profile :
        NavItem(
            "Profile",
            "profile",
            Icons.Default.AccountCircle
        )
}
