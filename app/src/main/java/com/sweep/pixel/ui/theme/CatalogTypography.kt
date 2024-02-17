package com.sweep.pixel.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.pixel.R

/**
 * Catalog typography.
 */

val dinoFontFamily =
    FontFamily(
        Font(R.font.dinpro_light, FontWeight.Light),
        Font(R.font.dinpro_regular, FontWeight.Normal),
        Font(R.font.dinpro_medium, FontWeight.Medium),
        Font(R.font.dinpro_bold, FontWeight.Bold),
        Font(R.font.dinpro_black, FontWeight.ExtraBold),
    )

@Immutable
data class PixelTypography(
    val superDino1: TextStyle,
    val superDino2: TextStyle,
    val dino1: TextStyle,
    val dino2: TextStyle,
    val dino3: TextStyle,
    val dino4: TextStyle,
    val big1: TextStyle,
    val big2: TextStyle,
    val big3: TextStyle,
    val big4: TextStyle,
    val medium1: TextStyle,
    val medium2: TextStyle,
    val medium3: TextStyle,
    val mediumSmall1: TextStyle,
    val mediumSmall2: TextStyle,
    val mediumSmall3: TextStyle,
    val small1: TextStyle,
    val small2: TextStyle,
    val small3: TextStyle,
    val small4: TextStyle,
    val superSmall1: TextStyle,
    val superSmall2: TextStyle,
    val superSmall3: TextStyle,
    val capsBig: TextStyle,
    val capsMedium: TextStyle,
    val capsSmall: TextStyle,
    val capsSuperSmall: TextStyle,
    val capsSuperTiny: TextStyle,
) {
    companion object {
        val Default =
            PixelTypography(
                superDino1 =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 36.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                superDino2 =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 28.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                dino1 =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 26.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                dino2 =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 22.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                dino3 =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 20.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                dino4 =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 36.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Normal,
                    ),
                big1 =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 18.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                big2 =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 16.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                big3 =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 16.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Medium,
                    ),
                big4 =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 16.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Normal,
                    ),
                medium1 =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 14.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                medium2 =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 14.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Medium,
                    ),
                medium3 =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 14.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Normal,
                    ),
                mediumSmall1 =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 14.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                mediumSmall2 =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 13.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Medium,
                    ),
                mediumSmall3 =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 13.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Normal,
                    ),
                small1 =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 12.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                small2 =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 12.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Normal,
                    ),
                small3 =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 11.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                small4 =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 11.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Normal,
                    ),
                superSmall1 =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 10.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                superSmall2 =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 10.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Medium,
                    ),
                superSmall3 =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 10.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Normal,
                    ),
                capsBig =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 16.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                capsMedium =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 14.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                capsSmall =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 12.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                capsSuperSmall =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 10.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                capsSuperTiny =
                    TextStyle.Default.copy(
                        fontFamily = dinoFontFamily,
                        fontSize = 8.sp,
                        letterSpacing = 0.2.sp,
                        fontWeight = FontWeight.Bold,
                    ),
            )
    }
}
