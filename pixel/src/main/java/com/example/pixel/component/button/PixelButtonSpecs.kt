/*
 * Created by Mohamad Hamade (Vordead) on 2/19/24, 1:02 AM.
 * Last modified 2/19/24, 12:58 AM
 * Copyright (c) 2024.
 * Pixel. All rights reserved.
 */

package com.example.pixel.component.button

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.pixel.theme.Padding
import com.example.pixel.theme.tokens.TypographyTokens

/**
 * Sealed class representing the type of button.
 */
sealed class ButtonType {
    /** Default button type. */
    data object Default : ButtonType()
    /** Button type with capitalized text. */

    data object TextCaps : ButtonType()
    /** Button type with an icon. */

    data object WithIcon : ButtonType()
    /** Filled width button type. */
    data object Fill : ButtonType()
}

/**
 * Sealed class representing the specifications for a pixel button.
 */
sealed class PixelButtonSpecs {
    /** The style of text displayed on the button. */

    abstract val textStyle: TextStyle
    /** The minimum width of the button. */

    abstract val minWidth: Dp
    /** The horizontal padding of the button. */

    abstract val horizontalPadding: Dp
    /** The vertical padding of the button. */

    abstract val verticalPadding: Dp
    /** The padding around the icon within the button. */

    abstract val iconPadding: Dp
    /** The size of the icon within the button. */

    abstract val iconSize: Dp
    /** The corner radius of the button. Default value is 6.dp. */

    open val radius: Dp = 6.dp
    /** The type of the button. Default value is [ButtonType.Default]. */

    open val buttonType: ButtonType = ButtonType.Default

    /**
     * Specification for a skinny button.
     * @param buttonType The type of the button.
     * @param isBold Indicates whether the text should be displayed in bold.
     */
    data class Skinny(override val buttonType: ButtonType, val isBold: Boolean = false) : PixelButtonSpecs() {

        override val horizontalPadding: Dp = Padding.Default.p9
        override val verticalPadding: Dp = Padding.Default.p3

        override val textStyle: TextStyle
            get() = when (buttonType) {
                ButtonType.TextCaps -> TypographyTokens.CapsSmall
                ButtonType.Default, ButtonType.WithIcon, ButtonType.Fill -> if (isBold) TypographyTokens.Medium1 else TypographyTokens.Medium3
            }
        override val minWidth: Dp
            get() = when (buttonType) {
                ButtonType.Default, ButtonType.TextCaps, ButtonType.WithIcon -> 70.dp
                ButtonType.Fill -> Dp.Infinity
            }

        override val iconPadding: Dp
            get() = when (buttonType) {
                ButtonType.WithIcon, ButtonType.Fill -> Padding.Default.p4
                else -> Dp.Unspecified
            }
        override val iconSize: Dp
            get() = when (buttonType) {
                ButtonType.WithIcon, ButtonType.Fill -> 14.dp
                else -> Dp.Unspecified
            }
    }

    /**
     * Specification for a normal button.
     * @param buttonType The type of the button.
     * @param isBold Indicates whether the text should be displayed in bold.
     */
    data class Normal(override val buttonType: ButtonType, val isBold: Boolean = false) : PixelButtonSpecs() {

        override val minWidth: Dp = 82.dp
        override val verticalPadding: Dp = Padding.Default.p4

        override val textStyle: TextStyle
            get() = when (buttonType) {
                ButtonType.TextCaps -> TypographyTokens.CapsMedium
                else -> if (isBold) TypographyTokens.Big2 else TypographyTokens.Big4
            }

        override val horizontalPadding: Dp
            get() = when (buttonType) {
                ButtonType.Default, ButtonType.TextCaps, ButtonType.WithIcon -> Padding.Default.p10
                ButtonType.Fill -> Dp.Unspecified
            }
        override val iconPadding: Dp
            get() = when (buttonType) {
                ButtonType.WithIcon, ButtonType.Fill -> Padding.Default.p4
                else -> Dp.Unspecified
            }
        override val iconSize: Dp
            get() = when (buttonType) {
                ButtonType.WithIcon, ButtonType.Fill -> 16.dp
                else -> Dp.Unspecified
            }
    }

    /**
     * Specification for a big button.
     * @param buttonType The type of the button.
     * @param isBold Indicates whether the text should be displayed in bold.
     */
    data class Big(override val buttonType: ButtonType, val isBold: Boolean = false) : PixelButtonSpecs() {
        override val verticalPadding: Dp = Padding.Default.p5
        override val textStyle: TextStyle
            get() = when (buttonType) {
                ButtonType.TextCaps -> TypographyTokens.CapsBig
                else -> if (isBold) TypographyTokens.Dino3 else TypographyTokens.Dino4
            }
        override val minWidth: Dp
            get() = when (buttonType) {
                ButtonType.Fill -> Dp.Infinity
                else -> 94.dp
            }
        override val horizontalPadding: Dp
            get() = when (buttonType) {
                ButtonType.Fill -> Dp.Unspecified
                else -> Padding.Default.p11
            }
        override val iconPadding: Dp
            get() = when (buttonType) {
                ButtonType.WithIcon, ButtonType.Fill -> Padding.Default.p5
                else -> Dp.Unspecified
            }
        override val iconSize: Dp
            get() = when (buttonType) {
                ButtonType.WithIcon, ButtonType.Fill -> 18.dp
                else -> Dp.Unspecified
            }

    }
}
