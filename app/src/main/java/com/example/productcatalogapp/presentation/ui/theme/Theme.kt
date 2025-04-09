package com.example.productcatalogapp.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Define your custom color variables
val PrimaryColor = Color(0xFF6200EE)
val OnPrimaryColor = Color.White
val BackgroundDark = Color(0xFF121212)
val BackgroundLight = Color(0xFFFFFFFF)
val OnBackgroundDark = Color(0xFFE0E0E0)
val OnBackgroundLight = Color(0xFF333333)

// Color schemes for dark and light themes
private val DarkColorScheme = darkColorScheme(
    primary = PrimaryColor,
    onPrimary = OnPrimaryColor,
    background = BackgroundDark,
    onBackground = OnBackgroundDark
)

private val LightColorScheme = lightColorScheme(
    primary = PrimaryColor,
    onPrimary = OnPrimaryColor,
    background = BackgroundLight,
    onBackground = OnBackgroundLight
)

// Theme function
@Composable
fun ProductCatalogAppTheme(
    darkTheme: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme


        MaterialTheme(
            colorScheme = colorScheme,
            content = content
        )

}
