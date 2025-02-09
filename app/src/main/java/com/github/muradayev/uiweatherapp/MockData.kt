package com.github.muradayev.uiweatherapp

import androidx.compose.runtime.Composable

val mockHourlyList = listOf(
    HourlyModel("9 pm", 14, "cloudy"),
    HourlyModel("10 pm", 28, "sunny"),
    HourlyModel("11 pm", 10, "wind"),
    HourlyModel("12 pm", 5, "rainy"),
    HourlyModel("1 am", 8, "storm"),
)

val mockFutureList = listOf(
    FutureModel("Sat", "storm", "Storm", 24, 12),
    FutureModel("Sun", "cloudy", "Cloudy", 25, 16),
    FutureModel("Mon", "windy", "Windy", 29, 15),
    FutureModel("Tue", "cloudy_sunny", "Cloudy Sunny", 23, 14),
    FutureModel("Wen", "sunny", "Sunny", 28, 11),
    FutureModel("Thu", "rainy", "Rainy", 23, 12),
)

@Composable
fun getDrawableResourceId(picPath: String): Int {
    return when(picPath) {
        "storm" -> R.drawable.storm
        "cloudy" -> R.drawable.cloudy
        "windy" -> R.drawable.windy
        "cloudy_sunny" -> R.drawable.cloudy_sunny
        "sunny" -> R.drawable.sunny
        "rainy" -> R.drawable.rainy
        else -> R.drawable.sunny
    }
}