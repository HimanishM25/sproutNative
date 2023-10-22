package com.k_fene_8.sproutnative.presentation.bottom_navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.k_fene_8.sproutnative.presentation.screens.Account
import com.k_fene_8.sproutnative.presentation.screens.Home
import com.k_fene_8.sproutnative.presentation.screens.Search
import com.k_fene_8.sproutnative.presentation.weather.WeatherViewModel

@OptIn(ExperimentalMaterial3Api::class)
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