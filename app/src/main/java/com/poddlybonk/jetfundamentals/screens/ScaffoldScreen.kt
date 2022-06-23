package com.poddlybonk.jetfundamentals.screens

import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.res.colorResource
import com.poddlybonk.jetfundamentals.R
import com.poddlybonk.jetfundamentals.router.BackButtonHandler
import com.poddlybonk.jetfundamentals.router.JetFundamentalsRouter
import com.poddlybonk.jetfundamentals.router.Screen
import kotlinx.coroutines.CoroutineScope

@Composable
fun ScaffoldScreen() {
    MyScaffold()

    BackButtonHandler {
        JetFundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyScaffold() {
    val scaffoldState: ScaffoldState = rememberScaffoldState()
    val scope: CoroutineScope = rememberCoroutineScope()
    
    Scaffold(
        scaffoldState = scaffoldState,
        contentColor = colorResource(id = R.color.colorPrimary),
        content = { MyRow() },
        topBar = { MyTopAppBar(scaffoldState = scaffoldState, scope = scope) },
        bottomBar = { MyBottomAppBar() },
        drawerContent = { MyColumn() }
    )
}

@Composable
fun MyTopAppBar(scaffoldState: ScaffoldState, scope: CoroutineScope) {
    // TODO write your code here
}

@Composable
fun MyBottomAppBar() {
    // TODO write your code here
}
