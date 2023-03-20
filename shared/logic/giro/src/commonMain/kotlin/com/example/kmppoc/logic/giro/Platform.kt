package com.example.kmppoc.logic.giro

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform