package com.example.kmppoc.android.home

import androidx.annotation.StringRes
import com.example.kmppoc.android.R


sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    object Banking: Screen("banking", R.string.banking)
    object Investing: Screen("investing", R.string.investing)
}
