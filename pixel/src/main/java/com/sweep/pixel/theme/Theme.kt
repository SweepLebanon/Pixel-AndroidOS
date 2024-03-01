/*
 * Created by Mohamad Hamade (Vordead) on 2/19/24, 1:03 AM.
 * Last modified 2/18/24, 5:06 PM
 * Copyright (c) 2024.
 * Pixel. All rights reserved.
 */

package com.sweep.pixel.theme

import androidx.compose.material3.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.TextStyle

@Composable
fun PixelTheme(
    colorScheme: ColorScheme = PixelTheme.colorScheme,
    typography: Typography = PixelTheme.typography,
    padding: Padding = PixelTheme.padding,
    content: @Composable () -> Unit,
) {

    val rememberedColorScheme = remember {
        // Explicitly creating a new object here so we don't mutate the initial [colorScheme]
        // provided, and overwrite the values set in it.
        colorScheme.copy()
    }.apply {
        updateColorSchemeFrom(colorScheme)
    }

    CompositionLocalProvider(
        LocalColorScheme providesDefault rememberedColorScheme,
        LocalTypography provides typography,
        LocalPadding provides padding,

    ) {
        ProvideTextStyle(value = typography.big2, content = content)
    }
}

object PixelTheme {
    val colorScheme: ColorScheme
        @ReadOnlyComposable
        @Composable get() = LocalColorScheme.current

    val typography: Typography
        @ReadOnlyComposable
        @Composable get() = LocalTypography.current

    val padding: Padding
        @ReadOnlyComposable
        @Composable get() = LocalPadding.current

}

internal val DefaultTextStyle = TextStyle.Default.copy()
