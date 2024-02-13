package com.k_fene_8.sproutnative.presentation.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.k_fene_8.sproutnative.presentation.widgets.common_components.StandardButton
import com.k_fene_8.sproutnative.presentation.widgets.weather.WeatherCard
import com.k_fene_8.sproutnative.presentation.widgets.weather.WeatherViewModel


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Home(viewModel: WeatherViewModel, navController:NavHostController) = Column (

    modifier = Modifier
        .verticalScroll(enabled = true, state = rememberScrollState())
        .fillMaxSize()
        .background(Color.Transparent)
        .padding(16.dp),
    verticalArrangement = Arrangement.spacedBy(16.dp),
){
    Text(text = "Hello User!",
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(16.dp))
    WeatherCard(state =viewModel.state)
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(15.dp))
            ){
        Column {
            Text(
                text = "Get Recommendations",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(16.dp)
            )
            Text(
                text = "We'll assist you in selecting the most thriving and appropriate plants!",
                color = Color.Gray,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.absolutePadding(left = 16.dp, right = 16.dp)
            )
            StandardButton(text = "Recommend", color = Color(0xfff36b77)) { /*TODO*/ }
        }
    }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(15.dp))
    ){
        Row {
            Column {
                Text(
                    text = "Detect Ailments",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(16.dp)
                )
                Text(
                    text = "Restore the vibrancy of your plants",
                    color = Color.Gray,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.absolutePadding(left = 16.dp, right = 16.dp)
                )
                StandardButton(
                    onClick = { navController.navigate("scanner") },
                    text = "Scan",
                    color = Color(0xfff36b77)
                )
            }
        }
    }
}


