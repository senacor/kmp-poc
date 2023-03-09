package com.example.kmppoc.data.investing

class DataInvesting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello fom DataInvesting, ${platform.name}!"
    }
}