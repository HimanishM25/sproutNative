package com.k_fene_8.sproutnative.widgets

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun BottomNavGraph(navController: NavController){
    NavHost(navController = rememberNavController(), startDestination = "home"){
        composable("home"){
            Text(text = "Home")
        }
        composable("search"){
            Text(text = "Search")
        }
        composable("account"){
            Text(text = "Account")
        }
    }
}