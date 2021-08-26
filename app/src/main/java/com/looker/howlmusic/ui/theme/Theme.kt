package com.looker.howlmusic.ui.theme

import android.view.Window
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = primaryColor,
    primaryVariant = primaryDarkColor,
    onPrimary = primaryTextColor,
    secondary = secondaryColor,
    secondaryVariant = secondaryDarkColor,
    onSecondary = secondaryTextColor,
    background = BlackGrey,
    surface = GreyOnBlack,
    onSurface = Color.White,
    onBackground = Color.White
)

private val LightColorPalette = lightColors(
    primary = primaryColor,
    primaryVariant = primaryLightColor,
    onPrimary = primaryTextColor,
    secondary = secondaryColor,
    secondaryVariant = secondaryLightColor,
    onSecondary = secondaryTextColor,
    background = Color.White,
    surface = WhiteOnWhite,
    onSurface = BlackGrey,
    onBackground = BlackGrey
)

@Composable
fun HowlMusicTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}