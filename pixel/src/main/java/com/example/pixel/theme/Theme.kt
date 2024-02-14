package com.example.pixel.theme

import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
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
)


val LocalColors = staticCompositionLocalOf {
    ExtendedColors(
        primaryColors = PrimaryColors(
            blue = Color.Transparent,
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

val lightColorScheme = lightColorScheme(
    blue = Blue,
    beige = Beige,
    barleyWhite = BarleyWhite,
    cararra = Cararra,
    cosmos = Cosmos,
    cottonCandy = CottonCandy,
    maximumBlue = MaximusBlue,
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
    dark8 = Dark8
)

val darkColorScheme = darkColorScheme(
    blue = Blue,
    beige = Beige,
    barleyWhite = BarleyWhite,
    cararra = Cararra,
    cosmos = Cosmos,
    cottonCandy = CottonCandy,
    maximumBlue = MaximusBlue,
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
    dark8 = Dark8
)

/**
 * AppCatalog theme.
 *
 * @param darkTheme Whether the theme should use a dark color scheme (follows system by default).
 */
@Composable
fun AppCatalogTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = if(darkTheme) darkColorScheme else lightColorScheme
    PixelTheme(
        colorScheme = colorScheme,
        content = content
    )
}


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


// Use with eg. ExtendedTheme.colors.tertiary
object PixelTheme {
    val colors: ExtendedColors
        @ReadOnlyComposable
        @Composable get() = LocalColors.current

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

@Immutable
private object MaterialRippleTheme : RippleTheme {
    @Composable
    override fun defaultColor() = LocalContentColor.current

    @Composable
    override fun rippleAlpha() = DefaultRippleAlpha
}

private val DefaultRippleAlpha = RippleAlpha(
    pressedAlpha = StateTokens.PressedStateLayerOpacity,
    focusedAlpha = StateTokens.FocusStateLayerOpacity,
    draggedAlpha = StateTokens.DraggedStateLayerOpacity,
    hoveredAlpha = StateTokens.HoverStateLayerOpacity
)

internal object StateTokens {
    const val DraggedStateLayerOpacity = 0.16f
    const val FocusStateLayerOpacity = 0.12f
    const val HoverStateLayerOpacity = 0.08f
    const val PressedStateLayerOpacity = 0.12f
}

@Composable
internal fun rememberTextSelectionColors(colorScheme: ColorScheme): TextSelectionColors {
    val primaryColor = colorScheme.blue
    return remember(primaryColor) {
        TextSelectionColors(
            handleColor = primaryColor,
            backgroundColor = primaryColor.copy(alpha = TextSelectionBackgroundOpacity),
        )
    }
}

internal const val TextSelectionBackgroundOpacity = 0.4f
