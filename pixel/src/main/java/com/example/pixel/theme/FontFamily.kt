package com.example.pixel.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.pixel.R

object FontFamily {
    val dinoFontFamily = FontFamily(
        Font(R.font.dinpro_light, FontWeight.Light),
        Font(R.font.dinpro_regular, FontWeight.Normal),
        Font(R.font.dinpro_medium, FontWeight.Medium),
        Font(R.font.dinpro_bold, FontWeight.Bold),
        Font(R.font.dinpro_black, FontWeight.ExtraBold)
    )
}
