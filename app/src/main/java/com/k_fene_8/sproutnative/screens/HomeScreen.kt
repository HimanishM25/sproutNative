package com.k_fene_8.sproutnative.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.time.LocalTime

@RequiresApi(Build.VERSION_CODES.O)
val currentTime: LocalTime = LocalTime.now()

@RequiresApi(Build.VERSION_CODES.O)
val hour: Int = currentTime.hour
@RequiresApi(Build.VERSION_CODES.O)
val colors = when (hour) {
    in 0..5 -> listOf(Color.Blue, Color.Cyan)
    in 6..11 -> listOf(Color.Cyan, Color.Yellow)
    in 12..17 -> listOf(Color.Yellow, Color(0xFFFF8000))
    in 18..23 -> listOf(Color(0xFFFF8000), Color.Red)
    else -> listOf(Color.Black, Color.White)}
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Home() {
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
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(15.dp))
                .background(
                    Brush.linearGradient(
                        colors = colors,
                        start = Offset.Zero,
                        end = Offset.Infinite,
                        tileMode = TileMode.Clamp
                    )
                )
        ) {
            Column {
                Text(
                    text = "Today's Weather",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(16.dp)
                )
                Text(
                    text = hour.toString(),
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(15.dp))
                .background(
                    Color(0xffe5e5e5)
                )
                ){
            Column {
                Text(
                    text = "Get Recommendations",
                    color = Color.Black,
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
                    colors= androidx.compose.material3.ButtonDefaults.buttonColors(
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
        Box(
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
                        color = Color.Black,
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

@RequiresApi(Build.VERSION_CODES.O)
@Preview
@Composable
fun HomePreview() {
    Home()
}