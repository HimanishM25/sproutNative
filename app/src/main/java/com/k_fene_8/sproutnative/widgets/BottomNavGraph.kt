package com.k_fene_8.sproutnative.widgets

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = BottomNavBarItems.Home.route){
        composable(route=BottomNavBarItems.Home.route){
            Home()
        }
        composable(route=BottomNavBarItems.Search.route){
            Search()
        }
        composable(route=BottomNavBarItems.Account.route){
            Account()
        }
    }
}