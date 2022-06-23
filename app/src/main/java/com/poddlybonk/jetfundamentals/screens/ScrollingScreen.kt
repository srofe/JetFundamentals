package com.poddlybonk.jetfundamentals.screens

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.poddlybonk.jetfundamentals.router.BackButtonHandler
import com.poddlybonk.jetfundamentals.router.JetFundamentalsRouter
import com.poddlybonk.jetfundamentals.router.Screen

@Composable
fun ScrollingScreen() {
    MyScrollingScreen()

    BackButtonHandler {
        JetFundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyScrollingScreen() {
    // TODO add your code here
}

@Composable
fun BookImage(@DrawableRes imageResId: Int, @StringRes contentDescriptionResId: Int) {
    Image(
        bitmap = ImageBitmap.imageResource(imageResId),
        contentDescription = stringResource(contentDescriptionResId),
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.size(476.dp, 616.dp)
    )
}
