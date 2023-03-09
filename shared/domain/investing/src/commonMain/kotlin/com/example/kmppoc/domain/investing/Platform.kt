package com.example.kmppoc.domain.investing

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform