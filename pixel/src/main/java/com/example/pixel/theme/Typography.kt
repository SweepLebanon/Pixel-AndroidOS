/*
 * Created by Mohamad Hamade (Vordead) on 2/19/24, 1:03 AM.
 * Last modified 2/14/24, 7:45 PM
 * Copyright (c) 2024.
 * Pixel. All rights reserved.
 */

package com.example.pixel.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import com.example.pixel.theme.tokens.TypographyTokens

@Immutable
class Typography(
    val superDino1: TextStyle = TypographyTokens.SuperDino1,
    val superDino2: TextStyle = TypographyTokens.SuperDino2,
    val dino1: TextStyle = TypographyTokens.Dino1,
    val dino2: TextStyle = TypographyTokens.Dino2,
    val dino3: TextStyle = TypographyTokens.Dino3,
    val dino4: TextStyle = TypographyTokens.Dino4,
    val big1: TextStyle = TypographyTokens.Big1,
    val big2: TextStyle = TypographyTokens.Big2,
    val big3: TextStyle = TypographyTokens.Big3,
    val big4: TextStyle = TypographyTokens.Big4,
    val medium1: TextStyle = TypographyTokens.Medium1,
    val medium2: TextStyle = TypographyTokens.Medium2,
    val medium3: TextStyle = TypographyTokens.Medium3,
    val mediumSmall1: TextStyle = TypographyTokens.MediumSmall1,
    val mediumSmall2: TextStyle = TypographyTokens.MediumSmall2,
    val mediumSmall3: TextStyle = TypographyTokens.MediumSmall3,
    val small1: TextStyle = TypographyTokens.Small1,
    val small2: TextStyle = TypographyTokens.Small2,
    val small3: TextStyle = TypographyTokens.Small3,
    val small4: TextStyle = TypographyTokens.Small4,
    val superSmall1: TextStyle = TypographyTokens.SuperSmall1,
    val superSmall2: TextStyle = TypographyTokens.SuperSmall2,
    val superSmall3: TextStyle = TypographyTokens.SuperSmall3,
    val capsBig: TextStyle = TypographyTokens.CapsBig,
    val capsMedium: TextStyle = TypographyTokens.CapsMedium,
    val capsSmall: TextStyle = TypographyTokens.CapsSmall,
    val capsSuperSmall: TextStyle = TypographyTokens.CapsSuperSmall,
    val capsSuperTiny: TextStyle = TypographyTokens.CapsSuperTiny
) {
    fun copy(
        superDino1: TextStyle,
        superDino2: TextStyle,
        dino1: TextStyle,
        dino2: TextStyle,
        dino3: TextStyle,
        dino4: TextStyle,
        big1: TextStyle,
        big2: TextStyle,
        big3: TextStyle,
        big4: TextStyle,
        medium1: TextStyle,
        medium2: TextStyle,
        medium3: TextStyle,
        mediumSmall1: TextStyle,
        mediumSmall2: TextStyle,
        mediumSmall3: TextStyle,
        small1: TextStyle,
        small2: TextStyle,
        small3: TextStyle,
        small4: TextStyle,
        superSmall1: TextStyle,
        superSmall2: TextStyle,
        superSmall3: TextStyle,
        capsBig: TextStyle,
        capsMedium: TextStyle,
        capsSmall: TextStyle,
        capsSuperSmall: TextStyle,
        capsSuperTiny: TextStyle
    ): Typography =
        Typography(
            superDino1 = superDino1,
            superDino2 = superDino2,
            dino1 = dino1,
            dino2 = dino2,
            dino3 = dino3,
            dino4 = dino4,
            big1 = big1,
            big2 = big2,
            big3 = big3,
            big4 = big4,
            medium1 = medium1,
            medium2 = medium2,
            medium3 = medium3,
            mediumSmall1 = mediumSmall1,
            mediumSmall2 = mediumSmall2,
            mediumSmall3 = mediumSmall3,
            small1 = small1,
            small2 = small2,
            small3 = small3,
            small4 = small4,
            superSmall1 = superSmall1,
            superSmall2 = superSmall2,
            superSmall3 = superSmall3,
            capsBig = capsBig,
            capsMedium = capsMedium,
            capsSmall = capsSmall,
            capsSuperSmall = capsSuperSmall,
            capsSuperTiny = capsSuperTiny
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Typography) return false

        if (superDino1 != other.superDino1) return false
        if (superDino2 != other.superDino2) return false
        if (dino1 != other.dino1) return false
        if (dino2 != other.dino2) return false
        if (dino3 != other.dino3) return false
        if (dino4 != other.dino4) return false
        if (big1 != other.big1) return false
        if (big2 != other.big2) return false
        if (big3 != other.big3) return false
        if (big4 != other.big4) return false
        if (medium1 != other.medium1) return false
        if (medium2 != other.medium2) return false
        if (medium3 != other.medium3) return false
        if (mediumSmall1 != other.mediumSmall1) return false
        if (mediumSmall2 != other.mediumSmall2) return false
        if (mediumSmall3 != other.mediumSmall3) return false
        if (small1 != other.small1) return false
        if (small2 != other.small2) return false
        if (small3 != other.small3) return false
        if (small4 != other.small4) return false
        if (superSmall1 != other.superSmall1) return false
        if (superSmall2 != other.superSmall2) return false
        if (superSmall3 != other.superSmall3) return false
        if (capsBig != other.capsBig) return false
        if (capsMedium != other.capsBig) return false
        if (capsSmall != other.capsSmall) return false
        if (capsSuperSmall != other.capsSuperSmall) return false
        if (capsSuperTiny != other.capsSuperTiny) return false

        return true
    }

    override fun hashCode(): Int {
        var result = superDino1.hashCode()
        result = 31 * result + superDino2.hashCode()
        result = 31 * result + dino1.hashCode()
        result = 31 * result + dino2.hashCode()
        result = 31 * result + dino3.hashCode()
        result = 31 * result + dino4.hashCode()
        result = 31 * result + big1.hashCode()
        result = 31 * result + big2.hashCode()
        result = 31 * result + big3.hashCode()
        result = 31 * result + big4.hashCode()
        result = 31 * result + medium1.hashCode()
        result = 31 * result + medium2.hashCode()
        result = 31 * result + medium3.hashCode()
        result = 31 * result + mediumSmall1.hashCode()
        result = 31 * result + mediumSmall2.hashCode()
        result = 31 * result + mediumSmall3.hashCode()
        result = 31 * result + small1.hashCode()
        result = 31 * result + small2.hashCode()
        result = 31 * result + small3.hashCode()
        result = 31 * result + small4.hashCode()
        result = 31 * result + superSmall1.hashCode()
        result = 31 * result + superSmall2.hashCode()
        result = 31 * result + superSmall3.hashCode()
        result = 31 * result + capsBig.hashCode()
        result = 31 * result + capsMedium.hashCode()
        result = 31 * result + capsSmall.hashCode()
        result = 31 * result + capsSuperSmall.hashCode()
        result = 31 * result + capsSuperTiny.hashCode()
        return result
    }

    override fun toString(): String {
        return "Typography(superDino1=$superDino1, superDino2=$superDino2," +
                "dino1=$dino1, " +
                "dino2=$dino2, dino3=$dino3," +
                " dino4=$dino4, " +
                "big1=$big1, big2=$big2, big3=$big3, " +
                "big4=$big4, medium1=$medium1, medium2=$medium2, " +
                "medium3=$medium3, mediumSmall1=$mediumSmall1, mediumSmall2=$mediumSmall2" +
                "mediumSmall3=$mediumSmall3, small1=$small1, small2=$small2" +
                "small3=$small3, small4=$small4, superSmall1=$superSmall1" +
                "superSmall2=$superSmall2, superSmall3=$superSmall3, capsBig=$capsBig" +
                "capsMedium=$capsMedium, capsSmall=$capsSmall, capsSuperSmall=$capsSuperSmall" +
                "capsSuperTiny=$capsSuperTiny)"
    }
}


internal val LocalTypography = staticCompositionLocalOf { Typography() }

