package com.example.kmppoc.android.lib.investing

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.kmppoc.domain.investing.DomainInvesting
import kotlinx.coroutines.launch

@Composable
fun InvestingHome() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = android.R.color.holo_purple))
            .wrapContentSize(Alignment.Center)
    ) {
        val scope = rememberCoroutineScope()
        var text by remember { mutableStateOf("Loading") }
        LaunchedEffect(true) {
            scope.launch {
                text = try {
                    DomainInvesting().greet()
                } catch (e: Exception) {
                    e.localizedMessage ?: "error"
                }
            }
        }

        Text(
            text = "Investing Home 0.3 $text",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 20.sp
        )
    }
}