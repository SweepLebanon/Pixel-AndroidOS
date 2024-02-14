package com.sweep.pixel.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class PrimaryColors(
    val blue: Color, val beige: Color
)

@Immutable
data class SecondaryColors(
    val barleyWhite: Color,
    val cararra: Color,
    val cosmos: Color,
    val cottonCandy: Color,
    val maximusBlue: Color
)

@Immutable
data class GrayColors(
    val light1: Color,
    val light2: Color,
    val light3: Color,
    val light4: Color,
    val light5: Color,
    val light6: Color,
    val light7: Color,
    val light8: Color,
    val dark1: Color,
    val dark2: Color,
    val dark3: Color,
    val dark4: Color,
    val dark5: Color,
    val dark6: Color,
    val dark7: Color,
    val dark8: Color,
)

@Immutable
data class ExtendedColors(
    val primaryColors: PrimaryColors,
    val secondaryColors: SecondaryColors,
    val grayColors: GrayColors
) {
    companion object {
        val Default = ExtendedColors(
            primaryColors = PrimaryColors(
                blue = Blue,
                beige = Beige,
            ),
            secondaryColors = SecondaryColors(
                barleyWhite = BarleyWhite,
                cararra = Cararra,
                cosmos = Cosmos,
                cottonCandy = CottonCandy,
                maximusBlue = MaximusBlue
            ),
            grayColors = GrayColors(
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
        )
    }
}

val LocalExtendedColors = staticCompositionLocalOf {
    ExtendedColors(
        primaryColors = PrimaryColors(
            blue = Color.Unspecified,
            beige = Color.Unspecified,
        ),
        secondaryColors = SecondaryColors(
            barleyWhite = Color.Unspecified,
            cararra = Color.Unspecified,
            cosmos = Color.Unspecified,
            cottonCandy = Color.Unspecified,
            maximusBlue = Color.Unspecified
        ),
        grayColors = GrayColors(
            light1 = Color.Unspecified,
            light2 = Color.Unspecified,
            light3 = Color.Unspecified,
            light4 = Color.Unspecified,
            light5 = Color.Unspecified,
            light6 = Color.Unspecified,
            light7 = Color.Unspecified,
            light8 = Color.Unspecified,
            dark1 = Color.Unspecified,
            dark2 = Color.Unspecified,
            dark3 = Color.Unspecified,
            dark4 = Color.Unspecified,
            dark5 = Color.Unspecified,
            dark6 = Color.Unspecified,
            dark7 = Color.Unspecified,
            dark8 = Color.Unspecified,
        )
    )
}