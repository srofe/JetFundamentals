package com.poddlybonk.jetfundamentals.screens

import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import com.poddlybonk.jetfundamentals.router.BackButtonHandler
import com.poddlybonk.jetfundamentals.router.JetFundamentalsRouter
import com.poddlybonk.jetfundamentals.router.Screen

@Composable
fun ScaffoldScreen() {
    MyScaffold()

    BackButtonHandler {
        JetFundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyScaffold() {
    // TODO write your code here
}

@Composable
fun MyTopAppBar(scaffoldState: ScaffoldState) {
    // TODO write your code here
}

@Composable
fun MyBottomAppBar() {
    // TODO write your code here
}
