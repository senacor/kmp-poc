package com.example.kmppoc.domain.investing

import com.example.kmppoc.data.investing.DataInvesting

class DomainInvesting {
    private val platform: Platform = getPlatform()

    suspend fun greet(): String {
        return DataInvesting().greet() +  " - Hello from Domain Investing, ${platform.name}!"
    }
}