package com.k_fene_8.sproutnative.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {
    @GET("v1/forecast?hourly=temperature_2m,weathercode")
    suspend fun getWeatherData(
        @Query("latitude") lat:Double,
        @Query("longitude") lon:Double,
    ): WeatherDto
}