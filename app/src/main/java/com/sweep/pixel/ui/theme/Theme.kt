/*
 * Created by Mohamad Hamade (Vordead) on 2/19/24, 1:04 AM.
 * Last modified 2/17/24, 8:03 PM
 * Copyright (c) 2024.
 * Pixel. All rights reserved.
 */

package com.sweep.pixel.ui.theme

import androidx.compose.runtime.Composable
import com.sweep.pixel.theme.PixelTheme
import com.sweep.pixel.theme.darkColorScheme
import com.sweep.pixel.theme.lightColorScheme

val lightColorScheme =
    lightColorScheme(
        blue = Blue,
        beige = Beige,
        barleyWhite = BarleyWhite,
        cararra = Cararra,
        cosmos = Cosmos,
        cottonCandy = CottonCandy,
        greenBlue = MaximusBlue,
        lightFailure = LightFailure,
        lightNeutral = LightNeutral,
        lightSuccess = LightSuccess,
        darkFailure = DarkFailure,
        darkNeutral = DarkNeutral,
        darkSuccess = DarkSuccess,
        light1 = Light1,
        light2 = Light2,
        light3 = Light3,
        light4 = Light4,
        light5 = Light5,
        light6 = Light6,
        light7 = Light7,
        light8 = Light8,
        dark1 = Dark1,
        dark2 = Dark2,
        dark3 = Dark3,
        dark4 = Dark4,
        dark5 = Dark5,
        dark6 = Dark6,
        dark7 = Dark7,
        dark8 = Dark8,
    )

val darkColorScheme =
    darkColorScheme(
        blue = Blue,
        beige = Beige,
        barleyWhite = BarleyWhite,
        cararra = Cararra,
        cosmos = Cosmos,
        cottonCandy = CottonCandy,
        greenBlue = MaximusBlue,
        lightFailure = LightFailure,
        lightNeutral = LightNeutral,
        lightSuccess = LightSuccess,
        darkFailure = DarkFailure,
        darkNeutral = DarkNeutral,
        darkSuccess = DarkSuccess,
        light1 = Light1,
        light2 = Light2,
        light3 = Light3,
        light4 = Light4,
        light5 = Light5,
        light6 = Light6,
        light7 = Light7,
        light8 = Light8,
        dark1 = Dark1,
        dark2 = Dark2,
        dark3 = Dark3,
        dark4 = Dark4,
        dark5 = Dark5,
        dark6 = Dark6,
        dark7 = Dark7,
        dark8 = Dark8,
    )

/**
 * AppCatalog theme.
 *
 * @param darkTheme Whether the theme should use a dark color scheme (follows system by default).
 */
@Composable
fun AppCatalogTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit,
) {
    val colorScheme = if (darkTheme) darkColorScheme else lightColorScheme
    PixelTheme(
        colorScheme = colorScheme,
        content = content,
    )
}
