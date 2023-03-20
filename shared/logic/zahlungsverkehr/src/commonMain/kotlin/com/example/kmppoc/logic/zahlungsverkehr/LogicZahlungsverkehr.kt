package com.example.kmppoc.logic.zahlungsverkehr

import com.example.kmppoc.data.zahlungsverkehr.DataZahlungsverkehr

class LogicZahlungsverkehr {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return DataZahlungsverkehr().greet() +  "\nHello from Logic Zahlungsverkehr, ${platform.name}!"
    }
}