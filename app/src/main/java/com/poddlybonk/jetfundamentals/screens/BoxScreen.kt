package com.poddlybonk.jetfundamentals.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.poddlybonk.jetfundamentals.router.BackButtonHandler
import com.poddlybonk.jetfundamentals.router.JetFundamentalsRouter
import com.poddlybonk.jetfundamentals.router.Screen

@Composable
fun BoxScreen() {
    MyBox()

    BackButtonHandler {
        JetFundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyBox(modifier: Modifier = Modifier) {
    // TODO write your code here
}
