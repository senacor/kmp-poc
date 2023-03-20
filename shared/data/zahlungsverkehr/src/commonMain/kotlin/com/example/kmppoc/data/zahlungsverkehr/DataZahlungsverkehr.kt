package com.example.kmppoc.data.zahlungsverkehr

class DataZahlungsverkehr {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello from Data Zahlungsverkehr, ${platform.name}!"
    }
}