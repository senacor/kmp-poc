package com.example.kmppoc.logic.zahlungsverkehr

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform