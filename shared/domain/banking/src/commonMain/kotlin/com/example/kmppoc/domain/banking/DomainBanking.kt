package com.example.kmppoc.domain.banking

import com.example.kmppoc.data.banking.DataBanking

class DomainBanking {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return DataBanking().greet() +  " - Hello from Domain Banking, ${platform.name}!"
    }
}