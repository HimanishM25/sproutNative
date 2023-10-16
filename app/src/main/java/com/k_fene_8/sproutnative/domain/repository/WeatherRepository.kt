package com.k_fene_8.sproutnative.domain.repository

import com.k_fene_8.sproutnative.domain.weather.WeatherInfo
import com.k_fene_8.sproutnative.domain.util.Resource

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}