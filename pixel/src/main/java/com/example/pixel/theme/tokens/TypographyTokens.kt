package com.example.pixel.theme.tokens

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.pixel.theme.dinoFontFamily

internal object TypographyTokens {
    val SuperDino1 =
        DefaultTextStyle.copy(
            fontFamily = dinoFontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 36.sp,
        )
    val SuperDino2 =
        DefaultTextStyle.copy(
            fontFamily = dinoFontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp,
            letterSpacing = 0.2.sp,
        )
    val Dino1 = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.2.sp,
        fontSize = 26.sp,
    )

    val Dino2 = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.2.sp,
        fontSize = 22.sp,
    )
    val Dino3 = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.2.sp,
        fontSize = 20.sp,
    )
    val Dino4 = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.2.sp,
        fontSize = 36.sp,
    )
    val Big1 = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.2.sp,
        fontSize = 18.sp,
    )
    val Big2 = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.2.sp,
        fontSize = 16.sp,
    )
    val Big3 = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.2.sp,
        fontSize = 16.sp,
    )
    val Big4 = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.2.sp,
        fontSize = 16.sp,
    )
    val Medium1 = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.2.sp,
        fontSize = 14.sp,
    )
    val Medium2 = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.2.sp,
        fontSize = 14.sp,
    )
    val Medium3 = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.2.sp,
        fontSize = 14.sp,
    )
    val MediumSmall1 = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.2.sp,
        fontSize = 14.sp,
    )
    val MediumSmall2 = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.2.sp,
        fontSize = 13.sp,
    )
    val MediumSmall3 = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.2.sp,
        fontSize = 13.sp,
    )
    val Small1 = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.2.sp,
        fontSize = 12.sp,
    )
    val Small2 = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.2.sp,
        fontSize = 26.sp,
    )
    val Small3 = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.2.sp,
        fontSize = 11.sp,
    )
    val Small4 = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.2.sp,
        fontSize = 11.sp,
    )

    val SuperSmall1 = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.2.sp,
        fontSize = 10.sp,
    )

    val SuperSmall2 = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.2.sp,
        fontSize = 10.sp,
    )

    val SuperSmall3 = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.2.sp,
        fontSize = 10.sp,
    )

    val CapsBig = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.2.sp,
        fontSize = 16.sp,
    )

    val CapsMedium = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.2.sp,
        fontSize = 14.sp,
    )

    val CapsSmall = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.2.sp,
        fontSize = 12.sp,
    )

    val CapsSuperSmall = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.2.sp,
        fontSize = 10.sp,
    )

    val CapsSuperTiny = DefaultTextStyle.copy(
        fontFamily = dinoFontFamily,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.2.sp,
        fontSize = 8.sp,
    )

}

internal val DefaultTextStyle = TextStyle.Default.copy()
