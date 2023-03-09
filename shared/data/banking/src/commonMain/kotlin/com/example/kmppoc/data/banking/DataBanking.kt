package com.example.kmppoc.data.banking

class DataBanking {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello from Data Banking, ${platform.name}!"
    }
}