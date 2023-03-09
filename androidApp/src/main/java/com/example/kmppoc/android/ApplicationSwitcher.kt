package com.example.kmppoc.android

import androidx.compose.runtime.Composable
import com.example.kmppoc.android.home.HomeScreen
import com.example.kmppoc.android.login.LoginScreen

@Composable
fun ApplicationSwitcher() {
    val vm = UserState.current
    if (vm.isLoggedIn) {
        HomeScreen()
    } else {
        LoginScreen()
    }
}