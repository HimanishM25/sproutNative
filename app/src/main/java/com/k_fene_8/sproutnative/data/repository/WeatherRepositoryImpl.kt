package com.k_fene_8.sproutnative.data.repository

import android.os.Build
import androidx.annotation.RequiresApi
import com.k_fene_8.sproutnative.data.mappers.toWeatherInfo
import com.k_fene_8.sproutnative.data.remote.WeatherAPI
import com.k_fene_8.sproutnative.domain.repository.WeatherRepository
import com.k_fene_8.sproutnative.domain.util.Resource
import com.k_fene_8.sproutnative.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherAPI
): WeatherRepository {

    @RequiresApi(Build.VERSION_CODES.O)
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    lon = long
                ).toWeatherInfo()
            )
        } catch(e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}