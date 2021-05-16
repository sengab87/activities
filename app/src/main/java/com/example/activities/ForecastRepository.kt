package com.example.activities

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlin.random.Random


/// WebServices ///
class ForecastRepository {

    //// Weekly forecast /// Mutable
    private val _weeklyForecast = MutableLiveData<List<DailyForecast>>()
    val weeklyForecast: LiveData<List<DailyForecast>> = _weeklyForecast

    fun loadForecast(zipCode: String){
        val randomValues = List(7){ Random.nextFloat().rem(100) * 100 }
        val forecastItems = randomValues.map {temp ->
            DailyForecast(temp,"PartlyCloudy")
        }
        _weeklyForecast.setValue(forecastItems)
    }
}