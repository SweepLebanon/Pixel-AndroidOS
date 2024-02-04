package com.example.pixel.theme

import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color
import com.example.pixel.theme.tokens.ColorDarkTokens
import com.example.pixel.theme.tokens.ColorLightTokens

@Stable
class ColorScheme(
    blue: Color,
    beige: Color,
    barleyWhite: Color,
    cararra: Color,
    cosmos: Color,
    cottonCandy: Color,
    maximumBlue: Color,
    lightFailure: Color,
    lightNeutral: Color,
    lightSuccess: Color,
    darkFailure: Color,
    darkNeutral: Color,
    darkSuccess: Color,
    light1: Color,
    light2: Color,
    light3: Color,
    light4: Color,
    light5: Color,
    light6: Color,
    light7: Color,
    light8: Color,
    dark1: Color,
    dark2: Color,
    dark3: Color,
    dark4: Color,
    dark5: Color,
    dark6: Color,
    dark7: Color,
    dark8: Color,
) {
    var blue by mutableStateOf(blue, structuralEqualityPolicy())
        internal set
    var beige by mutableStateOf(beige, structuralEqualityPolicy())
        internal set
    var barleyWhite by mutableStateOf(barleyWhite, structuralEqualityPolicy())
        internal set
    var cararra by mutableStateOf(cararra, structuralEqualityPolicy())
        internal set
    var cosmos by mutableStateOf(cosmos, structuralEqualityPolicy())
        internal set
    var cottonCandy by mutableStateOf(cottonCandy, structuralEqualityPolicy())
        internal set
    var maximumBlue by mutableStateOf(maximumBlue, structuralEqualityPolicy())
        internal set
    var lightFailure by mutableStateOf(lightFailure, structuralEqualityPolicy())
        internal set
    var lightNeutral by mutableStateOf(lightNeutral, structuralEqualityPolicy())
        internal set
    var lightSuccess by mutableStateOf(lightSuccess, structuralEqualityPolicy())
        internal set
    var darkFailure by mutableStateOf(darkFailure, structuralEqualityPolicy())
        internal set
    var darkNeutral by mutableStateOf(darkNeutral, structuralEqualityPolicy())
        internal set
    var darkSuccess by mutableStateOf(darkSuccess, structuralEqualityPolicy())
        internal set
    var light1 by mutableStateOf(light1, structuralEqualityPolicy())
        internal set
    var light2 by mutableStateOf(light2, structuralEqualityPolicy())
        internal set
    var light3 by mutableStateOf(light3, structuralEqualityPolicy())
        internal set
    var light4 by mutableStateOf(light4, structuralEqualityPolicy())
        internal set
    var light5 by mutableStateOf(light5, structuralEqualityPolicy())
        internal set
    var light6 by mutableStateOf(light6, structuralEqualityPolicy())
        internal set
    var light7 by mutableStateOf(light7, structuralEqualityPolicy())
        internal set
    var light8 by mutableStateOf(light8, structuralEqualityPolicy())
        internal set
    var dark1 by mutableStateOf(dark1, structuralEqualityPolicy())
        internal set
    var dark2 by mutableStateOf(dark2, structuralEqualityPolicy())
        internal set
    var dark3 by mutableStateOf(dark3, structuralEqualityPolicy())
        internal set
    var dark4 by mutableStateOf(dark4, structuralEqualityPolicy())
        internal set
    var dark5 by mutableStateOf(dark5, structuralEqualityPolicy())
        internal set
    var dark6 by mutableStateOf(dark6, structuralEqualityPolicy())
        internal set
    var dark7 by mutableStateOf(dark7, structuralEqualityPolicy())
        internal set
    var dark8 by mutableStateOf(dark8, structuralEqualityPolicy())
        internal set

    fun copy(
        blue: Color = this.blue,
        beige: Color = this.beige,
        barleyWhite: Color = this.barleyWhite,
        cararra: Color = this.cararra,
        cosmos: Color = this.cosmos,
        cottonCandy: Color = this.cottonCandy,
        maximumBlue: Color = this.maximumBlue,
        lightFailure: Color = this.lightFailure,
        lightNeutral: Color = this.lightNeutral,
        lightSuccess: Color = this.lightSuccess,
        darkFailure: Color = this.darkFailure,
        darkNeutral: Color = this.darkNeutral,
        darkSuccess: Color = this.darkSuccess,
        light1: Color = this.light1,
        light2: Color = this.light2,
        light3: Color = this.light3,
        light4: Color = this.light4,
        light5: Color = this.light5,
        light6: Color = this.light6,
        light7: Color = this.light7,
        light8: Color = this.light8,
        dark1: Color = this.dark1,
        dark2: Color = this.dark2,
        dark3: Color = this.dark3,
        dark4: Color = this.dark4,
        dark5: Color = this.dark5,
        dark6: Color = this.dark6,
        dark7: Color = this.dark7,
        dark8: Color = this.dark8,
    ): ColorScheme =
        ColorScheme(
            blue = blue,
            beige = beige,
            barleyWhite = barleyWhite,
            cararra = cararra,
            cosmos = cosmos,
            cottonCandy = cottonCandy,
            maximumBlue = maximumBlue,
            lightFailure = lightFailure,
            lightNeutral = lightNeutral,
            lightSuccess = lightSuccess,
            darkFailure = darkFailure,
            darkNeutral = darkNeutral,
            darkSuccess = darkSuccess,
            light1 = light1,
            light2 = light2,
            light3 = light3,
            light4 = light4,
            light5 = light5,
            light6 = light6,
            light7 = light7,
            light8 = light8,
            dark1 = dark1,
            dark2 = dark2,
            dark3 = dark3,
            dark4 = dark4,
            dark5 = dark5,
            dark6 = dark6,
            dark7 = dark7,
            dark8 = dark8
        )

    override fun toString(): String {
        return "ColorScheme(" +
                "blue=$blue" +
                "beige=$beige" +
                "barleyWhite=$barleyWhite" +
                "cararra=$cararra" +
                "cosmos=$cosmos" +
                "cottonCandy=$cottonCandy" +
                "maximumBlue=$maximumBlue" +
                "lightFailure=$lightFailure" +
                "lightNeutral=$lightNeutral" +
                "lightSuccess=$lightSuccess" +
                "darkFailure=$darkFailure" +
                "darkNeutral=$darkNeutral" +
                "darkSuccess=$darkSuccess" +
                "light1=$light1" +
                "light2=$light2" +
                "light3=$light3" +
                "light4=$light4" +
                "light5=$light5" +
                "light6=$light6" +
                "light7=$light7" +
                "light8=$light8" +
                "dark1=$dark1" +
                "dark2=$dark2" +
                "dark3=$dark3" +
                "dark4=$dark4" +
                "dark5=$dark5" +
                "dark6=$dark6" +
                "dark7=$dark7" +
                "dark8=$dark8" +
                ")"
    }
}

fun lightColorScheme(
    blue: Color = ColorLightTokens.Primary,
    beige: Color = ColorLightTokens.OnPrimary,
    barleyWhite: Color = ColorLightTokens.PrimaryContainer,
    cararra: Color = ColorLightTokens.OnPrimaryContainer,
    cosmos: Color = ColorLightTokens.InversePrimary,
    cottonCandy: Color = ColorLightTokens.Secondary,
    maximumBlue: Color = ColorLightTokens.OnSecondary,
    lightFailure: Color = ColorLightTokens.SecondaryContainer,
    lightNeutral: Color = ColorLightTokens.OnSecondaryContainer,
    lightSuccess: Color = ColorLightTokens.Tertiary,
    darkFailure: Color = ColorLightTokens.OnTertiary,
    darkNeutral: Color = ColorLightTokens.TertiaryContainer,
    darkSuccess: Color = ColorLightTokens.OnTertiaryContainer,
    light1: Color = ColorLightTokens.Background,
    light2: Color = ColorLightTokens.OnBackground,
    light3: Color = ColorLightTokens.Surface,
    light4: Color = ColorLightTokens.OnSurface,
    light5: Color = ColorLightTokens.SurfaceVariant,
    light6: Color = ColorLightTokens.OnSurfaceVariant,
    light7: Color = blue,
    light8: Color = ColorLightTokens.InverseSurface,
    dark1: Color = ColorLightTokens.InverseOnSurface,
    dark2: Color = ColorLightTokens.Error,
    dark3: Color = ColorLightTokens.OnError,
    dark4: Color = ColorLightTokens.ErrorContainer,
    dark5: Color = ColorLightTokens.OnErrorContainer,
    dark6: Color = ColorLightTokens.Outline,
    dark7: Color = ColorLightTokens.OutlineVariant,
    dark8: Color = ColorLightTokens.Scrim,
): ColorScheme =
    ColorScheme(
        blue = blue,
        beige = beige,
        barleyWhite = barleyWhite,
        cararra = cararra,
        cosmos = cosmos,
        cottonCandy = cottonCandy,
        maximumBlue = maximumBlue,
        lightFailure = lightFailure,
        lightNeutral = lightNeutral,
        lightSuccess = lightSuccess,
        darkFailure = darkFailure,
        darkNeutral = darkNeutral,
        darkSuccess = darkSuccess,
        light1 = light1,
        light2 = light2,
        light3 = light3,
        light4 = light4,
        light5 = light5,
        light6 = light6,
        light7 = light7,
        light8 = light8,
        dark1 = dark1,
        dark2 = dark2,
        dark3 = dark3,
        dark4 = dark4,
        dark5 = dark5,
        dark6 = dark6,
        dark7 = dark7,
        dark8 = dark8
    )

/**
 * Returns a dark Material color scheme.
 */
fun darkColorScheme(
    blue: Color = ColorDarkTokens.Primary,
    beige: Color = ColorDarkTokens.OnPrimary,
    barleyWhite: Color = ColorDarkTokens.PrimaryContainer,
    cararra: Color = ColorDarkTokens.OnPrimaryContainer,
    cosmos: Color = ColorDarkTokens.InversePrimary,
    cottonCandy: Color = ColorDarkTokens.Secondary,
    maximumBlue: Color = ColorDarkTokens.OnSecondary,
    lightFailure: Color = ColorDarkTokens.SecondaryContainer,
    lightNeutral: Color = ColorDarkTokens.OnSecondaryContainer,
    lightSuccess: Color = ColorDarkTokens.Tertiary,
    darkFailure: Color = ColorDarkTokens.OnTertiary,
    darkNeutral: Color = ColorDarkTokens.TertiaryContainer,
    darkSuccess: Color = ColorDarkTokens.OnTertiaryContainer,
    light1: Color = ColorDarkTokens.Background,
    light2: Color = ColorDarkTokens.OnBackground,
    light3: Color = ColorDarkTokens.Surface,
    light4: Color = ColorDarkTokens.OnSurface,
    light5: Color = ColorDarkTokens.SurfaceVariant,
    light6: Color = ColorDarkTokens.OnSurfaceVariant,
    light7: Color = blue,
    light8: Color = ColorDarkTokens.InverseSurface,
    dark1: Color = ColorDarkTokens.InverseOnSurface,
    dark2: Color = ColorDarkTokens.Error,
    dark3: Color = ColorDarkTokens.OnError,
    dark4: Color = ColorDarkTokens.ErrorContainer,
    dark5: Color = ColorDarkTokens.OnErrorContainer,
    dark6: Color = ColorDarkTokens.Outline,
    dark7: Color = ColorDarkTokens.OutlineVariant,
    dark8: Color = ColorDarkTokens.Scrim,
): ColorScheme =
    ColorScheme(
        blue = blue,
        beige = beige,
        barleyWhite = barleyWhite,
        cararra = cararra,
        cosmos = cosmos,
        cottonCandy = cottonCandy,
        maximumBlue = maximumBlue,
        lightFailure = lightFailure,
        lightNeutral = lightNeutral,
        lightSuccess = lightSuccess,
        darkFailure = darkFailure,
        darkNeutral = darkNeutral,
        darkSuccess = darkSuccess,
        light1 = light1,
        light2 = light2,
        light3 = light3,
        light4 = light4,
        light5 = light5,
        light6 = light6,
        light7 = light7,
        light8 = light8,
        dark1 = dark1,
        dark2 = dark2,
        dark3 = dark3,
        dark4 = dark4,
        dark5 = dark5,
        dark6 = dark6,
        dark7 = dark7,
        dark8 = dark8
    )

/**
 * Updates the internal values of a given [ColorScheme] with values from the [other]
 * [ColorScheme].
 * This allows efficiently updating a subset of [ColorScheme], without recomposing every
 * composable that consumes values from [LocalColorScheme].
 *
 * Because [ColorScheme] is very wide-reaching, and used by many expensive composables in the
 * hierarchy, providing a new value to [LocalColorScheme] causes every composable consuming
 * [LocalColorScheme] to recompose, which is prohibitively expensive in cases such as animating one
 * color in the theme. Instead, [ColorScheme] is internally backed by [mutableStateOf], and this
 * function mutates the internal state of [this] to match values in [other]. This means that any
 * changes will mutate the internal state of [this], and only cause composables that are reading the
 * specific changed value to recompose.
 */
internal fun ColorScheme.updateColorSchemeFrom(other: ColorScheme) {
    blue = other.blue
    beige = other.beige
    barleyWhite = other.barleyWhite
    cararra = other.cararra
    cosmos = other.cosmos
    cottonCandy = other.cottonCandy
    maximumBlue = other.maximumBlue
    lightFailure = other.lightFailure
    lightNeutral = other.lightNeutral
    lightSuccess = other.lightSuccess
    darkFailure = other.darkFailure
    darkNeutral = other.darkNeutral
    darkSuccess = other.darkSuccess
    light1 = other.light1
    light2 = other.light2
    light3 = other.light3
    light4 = other.light4
    light5 = other.light5
    light6 = other.light6
    light7 = other.light7
    light8 = other.light8
    dark1 = other.dark1
    dark2 = other.dark2
    dark3 = other.dark3
    dark4 = other.dark4
    dark5 = other.dark5
    dark6 = other.dark6
    dark7 = other.dark7
    dark8 = other.dark8
}


/**
 * CompositionLocal used to pass [ColorScheme] down the tree.
 *
 * Setting the value here is typically done as part of [PixelTheme], which will automatically
 * handle efficiently updating any changed colors without causing unnecessary recompositions, using
 * [ColorScheme.updateColorSchemeFrom]. To retrieve the current value of this CompositionLocal, use
 * [PixelTheme.colorScheme].
 */
internal val LocalColorScheme = staticCompositionLocalOf { lightColorScheme() }

/**
 * A low level of alpha used to represent disabled components, such as text in a disabled Button.
 */
internal const val DisabledAlpha = 0.38f



