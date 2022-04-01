package com.metaweather.android.logic.network

import com.metaweather.android.MetaWeatherApplication
import com.metaweather.android.logic.model.DailyResponse
import com.metaweather.android.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {

    @GET("v2.5/${MetaWeatherApplication.TOKEN}/{lon},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lon") lng: String, @Path("lat") lat: String):
            Call<RealtimeResponse>

    @GET("v2.5/${MetaWeatherApplication.TOKEN}/{lon},{lat}/daily.json")
    fun getDailyWeather(@Path("lon") lng: String, @Path("lat") lat: String):
            Call<DailyResponse>

}