package com.k_fene_8.sproutnative.presentation.widgets.bottomNav

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.k_fene_8.sproutnative.presentation.screens.Account
import com.k_fene_8.sproutnative.presentation.screens.Home
import com.k_fene_8.sproutnative.presentation.screens.Scanner
import com.k_fene_8.sproutnative.presentation.screens.SearchScreen
import com.k_fene_8.sproutnative.presentation.widgets.weather.WeatherViewModel


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun BottomNavGraph(navController: NavHostController, viewModel: WeatherViewModel){
    NavHost(navController = navController, startDestination = BottomNavBarItems.Home.route){
        composable(route= BottomNavBarItems.Home.route){
            Home(viewModel = viewModel, navController = navController)
        }
        composable(route= BottomNavBarItems.Search.route){
            SearchScreen()
        }
        composable(route= BottomNavBarItems.Account.route){
            Account()
        }
        composable("scanner"){
            Scanner()
        }
    }
}