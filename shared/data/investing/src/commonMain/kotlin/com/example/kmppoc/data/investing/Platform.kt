package com.example.kmppoc.data.investing

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform