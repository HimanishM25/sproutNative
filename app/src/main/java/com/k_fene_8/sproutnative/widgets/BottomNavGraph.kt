package com.k_fene_8.sproutnative.widgets

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.k_fene_8.sproutnative.screens.Account
import com.k_fene_8.sproutnative.screens.Home
import com.k_fene_8.sproutnative.screens.Search

@RequiresApi(Build.VERSION_CODES.O)
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