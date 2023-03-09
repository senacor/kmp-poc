package com.example.kmppoc.data.banking

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform