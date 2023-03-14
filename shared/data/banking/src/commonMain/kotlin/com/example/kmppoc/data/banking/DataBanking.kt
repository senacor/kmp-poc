package com.example.kmppoc.data.banking

import kotlinx.datetime.*

class DataBanking {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello from Data Banking, ${platform.name}! There are ${daysUntilNewYear()} days until new year"
    }
}

fun daysUntilNewYear(): Int {
    val today = Clock.System.todayIn(TimeZone.currentSystemDefault())
    val closestNewYear = LocalDate(today.year + 1, 1, 1,)
    return today.daysUntil(closestNewYear)
}