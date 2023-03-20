package com.example.kmppoc.logic.giro

import com.example.kmppoc.data.giro.DataGiro

class LogicGiro {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return DataGiro().greet() +  " \n Hello from Logic Giro, ${platform.name}!"
    }
}