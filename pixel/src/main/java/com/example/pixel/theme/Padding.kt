/*
 * Created by Mohamad Hamade (Vordead) on 2/19/24, 1:03 AM.
 * Last modified 2/5/24, 12:35 AM
 * Copyright (c) 2024.
 * Pixel. All rights reserved.
 */

package com.example.pixel.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class Padding(
    val p0: Dp = Dp.Unspecified,
    val p1: Dp = Dp.Unspecified,
    val p2: Dp = Dp.Unspecified,
    val p3: Dp = Dp.Unspecified,
    val p4: Dp = Dp.Unspecified,
    val p5: Dp = Dp.Unspecified,
    val p6: Dp = Dp.Unspecified,
    val p7: Dp = Dp.Unspecified,
    val p8: Dp = Dp.Unspecified,
    val p9: Dp = Dp.Unspecified,
    val p10: Dp = Dp.Unspecified,
    val p11: Dp = Dp.Unspecified,
    val p12: Dp = Dp.Unspecified,
    val p13: Dp = Dp.Unspecified,
    val p14: Dp = Dp.Unspecified,
    val p15: Dp = Dp.Unspecified,
    val p16: Dp = Dp.Unspecified
) {
    companion object {
        val Default = Padding(
            p0 = 0.dp,
            p1 = 2.dp,
            p2 = 4.dp,
            p3 = 6.dp,
            p4 = 8.dp,
            p5 = 10.dp,
            p6 = 12.dp,
            p7 = 14.dp,
            p8 = 16.dp,
            p9 = 18.dp,
            p10 = 20.dp,
            p11 = 22.dp,
            p12 = 26.dp,
            p13 = 28.dp,
            p14 = 32.dp,
            p15 = 38.dp,
            p16 = 46.dp
        )
    }
}

val LocalPadding = staticCompositionLocalOf { Padding.Default }

