package com.example.pixel.theme

import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color

@Stable
class ColorScheme(
    blue: Color,
    beige: Color,
    barleyWhite: Color,
    cararra: Color,
    cosmos: Color,
    cottonCandy: Color,
    greenBlue: Color,
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
    var greenBlue by mutableStateOf(greenBlue, structuralEqualityPolicy())
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
        greenBlue: Color = this.greenBlue,
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
            greenBlue = greenBlue,
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
                "greenBlue=$greenBlue" +
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

/**
 * Returns a light Pixel color scheme.
 */
fun lightColorScheme(
    blue: Color = Blue,
    beige: Color = Beige,
    barleyWhite: Color = BarleyWhite,
    cararra: Color = Cararra,
    cosmos: Color = Cosmos,
    cottonCandy: Color = CottonCandy,
    greenBlue: Color = GreenBlue,
    lightFailure: Color = LightFailure,
    lightNeutral: Color = LightNeutral,
    lightSuccess: Color = LightSuccess,
    darkFailure: Color = DarkFailure,
    darkNeutral: Color = DarkNeutral,
    darkSuccess: Color = DarkSuccess,
    light1: Color = Light1,
    light2: Color = Light2,
    light3: Color = Light3,
    light4: Color = Light4,
    light5: Color = Light5,
    light6: Color = Light6,
    light7: Color = Light7,
    light8: Color = Light8,
    dark1: Color = Dark1,
    dark2: Color = Dark2,
    dark3: Color = Dark3,
    dark4: Color = Dark4,
    dark5: Color = Dark5,
    dark6: Color = Dark6,
    dark7: Color = Dark7,
    dark8: Color = Dark8,
): ColorScheme =
    ColorScheme(
        blue = blue,
        beige = beige,
        barleyWhite = barleyWhite,
        cararra = cararra,
        cosmos = cosmos,
        cottonCandy = cottonCandy,
        greenBlue = greenBlue,
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
 * Returns a dark Pixel color scheme.
 */
fun darkColorScheme(
    blue: Color = Blue,
    beige: Color = Beige,
    barleyWhite: Color = BarleyWhite,
    cararra: Color = Cararra,
    cosmos: Color = Cosmos,
    cottonCandy: Color = CottonCandy,
    greenBlue: Color = GreenBlue,
    lightFailure: Color = LightFailure,
    lightNeutral: Color = LightNeutral,
    lightSuccess: Color = LightSuccess,
    darkFailure: Color = DarkFailure,
    darkNeutral: Color = DarkNeutral,
    darkSuccess: Color = DarkSuccess,
    light1: Color = Light1,
    light2: Color = Light2,
    light3: Color = Light3,
    light4: Color = Light4,
    light5: Color = Light5,
    light6: Color = Light6,
    light7: Color = Light7,
    light8: Color = Light8,
    dark1: Color = Dark1,
    dark2: Color = Dark2,
    dark3: Color = Dark3,
    dark4: Color = Dark4,
    dark5: Color = Dark5,
    dark6: Color = Dark6,
    dark7: Color = Dark7,
    dark8: Color = Dark8,
): ColorScheme =
    ColorScheme(
        blue = blue,
        beige = beige,
        barleyWhite = barleyWhite,
        cararra = cararra,
        cosmos = cosmos,
        cottonCandy = cottonCandy,
        greenBlue = greenBlue,
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
    greenBlue = other.greenBlue
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



