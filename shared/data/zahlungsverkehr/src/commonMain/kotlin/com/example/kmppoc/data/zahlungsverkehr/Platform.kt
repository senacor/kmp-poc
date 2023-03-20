package com.example.kmppoc.data.zahlungsverkehr

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform