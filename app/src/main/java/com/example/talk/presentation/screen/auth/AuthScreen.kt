package com.example.talk.presentation.screen.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

@Composable
fun AuthScreen(navController: NavController) {

    val viewModel = viewModel<AuthViewModel>()
    val stateAuth = viewModel.state

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black),
    contentAlignment = Alignment.Center
    ) {
        Text(
            text = " Всем привет ",
            modifier = Modifier,
            fontSize = 24.sp,
            color = Color.White
        )
    }


}