package com.k_fene_8.sproutnative.presentation.widgets.bottomNav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavBarItems(
    val route:String,
    val title:String,
    val unselected:ImageVector,
    val selected:ImageVector,
){
    object Home: BottomNavBarItems(
        title = "Home",
        route = "home",
        selected = Icons.Filled.Home,
        unselected = Icons.Outlined.Home,

    )
    object Search: BottomNavBarItems(
        title = "Search",
        route = "search",
        selected = Icons.Filled.Search,
        unselected = Icons.Outlined.Search,

    )
    object Account: BottomNavBarItems(
        title = "Account",
        route = "account",
        selected = Icons.Filled.AccountCircle,
        unselected = Icons.Outlined.AccountCircle,

    )
}
