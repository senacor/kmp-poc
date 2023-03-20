package com.example.kmppoc.data.giro

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform