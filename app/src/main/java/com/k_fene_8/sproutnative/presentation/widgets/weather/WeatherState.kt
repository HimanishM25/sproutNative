package com.k_fene_8.sproutnative.presentation.widgets.weather

import com.k_fene_8.sproutnative.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
