package com.k_fene_8.sproutnative.presentation.widgets

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.k_fene_8.sproutnative.presentation.WeatherViewModel
import com.k_fene_8.sproutnative.presentation.screens.Account
import com.k_fene_8.sproutnative.presentation.screens.Home
import com.k_fene_8.sproutnative.presentation.screens.Search


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun BottomNavGraph(navController: NavHostController, viewModel: WeatherViewModel){
    NavHost(navController = navController, startDestination = BottomNavBarItems.Home.route){
        composable(route= BottomNavBarItems.Home.route){
            Home(viewModel = viewModel)
        }
        composable(route= BottomNavBarItems.Search.route){
            Search()
        }
        composable(route= BottomNavBarItems.Account.route){
            Account()
        }
    }
}