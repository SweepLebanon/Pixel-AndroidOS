/*
 * Created by Mohamad Hamade (Vordead) on 2/19/24, 1:03 AM.
 * Last modified 2/18/24, 5:29 PM
 * Copyright (c) 2024.
 * Pixel. All rights reserved.
 */

package com.sweep.pixel.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.sweep.pixel.R

object FontFamily {
    val dinProFontFamily = FontFamily(
        Font(R.font.dinpro_light, FontWeight.Light),
        Font(R.font.dinpro_regular, FontWeight.Normal),
        Font(R.font.dinpro_medium, FontWeight.Medium),
        Font(R.font.dinpro_bold, FontWeight.Bold),
        Font(R.font.dinpro_black, FontWeight.ExtraBold)
    )
}
