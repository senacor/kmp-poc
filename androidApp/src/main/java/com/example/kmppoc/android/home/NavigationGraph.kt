package com.example.kmppoc.android.home

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.kmppoc.android.lib.banking.BankingHome
import com.example.kmppoc.android.lib.investing.InvestingHome


@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = Screen.Banking.route) {
        composable(Screen.Banking.route) {
            BankingHome()
        }
        composable(Screen.Investing.route) {
            InvestingHome()
        }
    }
}
