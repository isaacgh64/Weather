package com.cursosandroidant.weather.common.entities

/****
 * Project: Weather
 * From: com.cursosandroidant.weather.common
 * Created by Alain Nicolás Tello on 26/03/22 at 15:09
 * All rights reserved 2022.
 *
 * All my Udemy Courses:
 * https://www.udemy.com/user/alain-nicolas-tello/
 * Web: www.alainnicolastello.com
 ***/
data class Current(
    val dt: Long,
    val humidity: Int,
    val temp: Double,
    val weather: List<Weather>,
    val sunrise: Long
): WeatherBase(dt, humidity, temp, weather)
