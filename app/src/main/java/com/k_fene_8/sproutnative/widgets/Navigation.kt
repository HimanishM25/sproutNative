package com.k_fene_8.sproutnative.widgets

import android.annotation.SuppressLint
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navigation() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navController=navController) },
    ){
        BottomNavGraph(navController = navController)
    }
}

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    var selectedItem by remember { mutableStateOf(0) }
    val barItems = listOf(
        BottomNavBarItems.Home,
        BottomNavBarItems.Search,
        BottomNavBarItems.Account
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    NavigationBar {
        barItems.forEachIndexed { index, barItem ->
            val selected = selectedItem == index
            NavigationBarItem(
                selected = selected,
                onClick = {
                    selectedItem = index
                    /* navigate to selected route */
                },
                icon = {
                    Icon(
                        imageVector = if (selected) barItem.selected else barItem.unselected,
                        contentDescription = barItem.title
                    )
                },
                label = { Text(text = barItem.title) },
                alwaysShowLabel = true
            )
        }
    }
}

data class BarItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val route: String
)

@Preview
@Composable
fun NavigationBarPreview() {
    Navigation()
}