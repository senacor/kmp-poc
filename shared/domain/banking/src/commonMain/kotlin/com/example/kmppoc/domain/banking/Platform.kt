package com.example.kmppoc.domain.banking

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform