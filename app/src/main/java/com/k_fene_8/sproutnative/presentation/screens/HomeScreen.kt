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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.k_fene_8.sproutnative.presentation.WeatherCard
import com.k_fene_8.sproutnative.presentation.WeatherViewModel




@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Home(viewModel: WeatherViewModel) {
    Column (
        modifier = Modifier
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
                Button(
                    onClick = { /*TODO*/ },
                    colors= ButtonDefaults.buttonColors(
                        containerColor = Color(0xfff36b77),
                        contentColor = Color.White
                    ),
                    modifier = Modifier
                        .padding(16.dp)
                        .height(50.dp)
                        .fillMaxWidth(),
                ) {
                    Text(
                        text = "Recommend",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
            }
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(15.dp))
                .background(
                    Color(0xffe5e5e5)
                )
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
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xffffbb6e),
                            contentColor = Color.White
                        ),
                        modifier = Modifier
                            .padding(16.dp)
                            .height(50.dp)
                            .fillMaxWidth(),
                    ) {
                        Text(
                            text = "Scan",
                            color = Color.White,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
            }
        }
    }
}

