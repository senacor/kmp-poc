package com.example.kmppoc.data.giro

class DataGiro {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello fom DataGiro, ${platform.name}!"
    }
}