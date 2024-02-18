/*
 * Created by Mohamad Hamade (Vordead) on 2/19/24, 1:02 AM.
 * Last modified 2/19/24, 12:45 AM
 * Copyright (c) 2024.
 * Pixel. All rights reserved.
 */

package com.example.pixel.component.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.HideImage
import androidx.compose.material.icons.outlined.Image
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.example.pixel.component.text.PixelText
import com.example.pixel.theme.PixelTheme

/**
 * Composable function for rendering a customizable PixelButton.
 *
 * @param onClick Callback to be invoked when the button is clicked.
 * @param modifier Modifier for styling and layout customization of the button.
 * @param enabled Whether the button is enabled or disabled. Default is true.
 * @param pixelButtonSpecs Specifications for customizing the appearance of the button.
 * @param circularShape Whether the button should have a circular shape. Default is true.
 * @param content The content of the button, typically consisting of text and/or icons.
 */
@Composable
private fun PixelButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    pixelButtonSpecs: PixelButtonSpecs,
    circularShape: Boolean = true,
    content: @Composable RowScope.() -> Unit
) {
    Button(colors = ButtonDefaults.buttonColors(
        containerColor = PixelTheme.colorScheme.light4,
        contentColor = PixelTheme.colorScheme.dark8,
        disabledContainerColor = PixelTheme.colorScheme.dark1.copy(alpha = 0.12f)
            .compositeOver(PixelTheme.colorScheme.dark1),
        disabledContentColor = PixelTheme.colorScheme.dark6.copy(alpha = 0.7f)
    ),
        shape = if (circularShape) CircleShape else RoundedCornerShape(pixelButtonSpecs.radius),
        elevation = ButtonDefaults.elevatedButtonElevation(),
        enabled = enabled,
        onClick = onClick,
        modifier = modifier,
        contentPadding = PaddingValues(
            horizontal = pixelButtonSpecs.horizontalPadding,
            vertical = pixelButtonSpecs.verticalPadding
        ),
        content = {
            ProvideTextStyle(
                value = pixelButtonSpecs.textStyle
            ) {
                content()
            }
        })
}

/**
 * Composable function for rendering a PixelButton with customizable text, icons, and appearance.
 *
 * @param text The text to be displayed on the button.
 * @param modifier Modifier for styling and layout customization of the button.
 * @param pixelButtonSpecs Specifications for customizing the appearance of the button.
 * @param headerImageVector Vector asset for an icon to be displayed before the text.
 * @param trailingImageVector Vector asset for an icon to be displayed after the text.
 * @param circularShape Whether the button should have a circular shape. Default is true.
 * @param enabled Whether the button is enabled or disabled. Default is true.
 * @param onClick Callback to be invoked when the button is clicked.
 */
@Composable
fun PixelButton(
    text: String,
    modifier: Modifier = Modifier,
    pixelButtonSpecs: PixelButtonSpecs = PixelButtonSpecs.Normal(buttonType = ButtonType.Default),
    headerImageVector: ImageVector? = null,
    trailingImageVector: ImageVector? = null,
    circularShape: Boolean = true,
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    val fillMaxWidthModifier: Modifier = if (pixelButtonSpecs.buttonType is ButtonType.Fill) {
        Modifier.fillMaxWidth()
    } else {
        Modifier
    }
    PixelButton(
        modifier = fillMaxWidthModifier.then(modifier),
        pixelButtonSpecs = pixelButtonSpecs,
        circularShape = circularShape,
        enabled = enabled,
        onClick = onClick,
    ) {
        if (headerImageVector != null) {
            Icon(
                imageVector = headerImageVector,
                contentDescription = null,
                modifier = Modifier
                    .padding(end = pixelButtonSpecs.iconPadding)
                    .size(pixelButtonSpecs.iconSize)
            )
        }
        PixelText(
            text = if (pixelButtonSpecs.buttonType is ButtonType.TextCaps) text.uppercase() else text,
            style = pixelButtonSpecs.textStyle
        )
        if (trailingImageVector != null) {
            Icon(
                imageVector = trailingImageVector,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = pixelButtonSpecs.iconPadding)
                    .size(pixelButtonSpecs.iconSize)
            )
        }
    }

}

@Preview
@Composable
private fun PixelButtonSkinny() {
    PixelButton(
        pixelButtonSpecs = PixelButtonSpecs.Skinny(buttonType = ButtonType.Default),
        onClick = { /*TODO*/ }) {
        Text(
            text = "Hello", color = PixelTheme.colorScheme.dark8,
        )
    }
}

@Preview
@Composable
private fun PixelButtonWithIcon() {
    PixelButton(pixelButtonSpecs = PixelButtonSpecs.Normal(buttonType = ButtonType.WithIcon),
        trailingImageVector = Icons.Outlined.Image,
        headerImageVector = Icons.Outlined.HideImage,
        circularShape = true,
        enabled = true,
        text = "Hello",
        onClick = {})
}

@Preview(showBackground = true, widthDp = 500)
@Composable
private fun PixelButtonFillIconSkinny() {
    Row {
        PixelButton(
            pixelButtonSpecs = PixelButtonSpecs.Skinny(buttonType = ButtonType.Fill, isBold = true),
            trailingImageVector = Icons.Outlined.Image,
            headerImageVector = Icons.Outlined.HideImage,
            circularShape = true,
            text = "Hello",
            onClick = {})
    }
}
