package com.example.pixel.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.pixel.theme.Padding
import com.example.pixel.theme.PixelTheme
import com.example.pixel.theme.tokens.TypographyTokens

@Composable
fun PixelButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    pixelButtonSpecs: PixelButtonSpecs,
    type: Type,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = PixelTheme.colorScheme.blue,
            contentColor = PixelTheme.colorScheme.beige,
            disabledContainerColor = PixelTheme.colorScheme.dark5
                .copy(alpha = 0.12f)
                .compositeOver(PixelTheme.colorScheme.lightNeutral),
            disabledContentColor = PixelTheme.colorScheme.dark6
                .copy(alpha = 0.7f)
        ),
        shape = RoundedCornerShape(pixelButtonSpecs.radius),
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
        }
    )
}

@Composable
fun PixelButton(
    modifier: Modifier = Modifier,
    pixelButtonSpecs: PixelButtonSpecs,
    imageVector: ImageVector,
    type: Type,
    text: String
) {
    pixelButtonSpecs.type = type
    PixelButton(modifier = modifier,
        type = Type.WithIcon,
        onClick = { /*TODO*/ }, pixelButtonSpecs = pixelButtonSpecs) {
        Icon(
            imageVector = imageVector,
            contentDescription = null,
            modifier = Modifier.padding(
                pixelButtonSpecs.iconPadding
            )
        )
        Text(text = text)
    }
}

val ButtonShape = RoundedCornerShape(percent = 50)

@Preview
@Composable
fun MyPixelButtonPreview() {
    PixelButton(pixelButtonSpecs = PixelButtonSpecs.Skinny,
        type = Type.Default,
        onClick = { /*TODO*/ }) {
        Text(
            text = "Hello", color = PixelTheme.colorScheme.dark8,
        )
    }
}

@Preview
@Composable
private fun PixelButtonWithIcon() {
    PixelButton(
        pixelButtonSpecs = PixelButtonSpecs.Normal,
        imageVector = Icons.Outlined.Image,
        text = "Hello",
        type = Type.WithIcon
    )
}

enum class Type {
    Default,
    TextCaps,
    WithIcon,
    Fill
}


sealed class PixelButtonSpecs {
    abstract val textStyle: TextStyle
    abstract val radius: Dp
    abstract val minWidth: Dp
    abstract val horizontalPadding: Dp
    abstract val verticalPadding: Dp
    open var type: Type = Type.Default
    abstract val iconPadding: Dp
    abstract val iconSize: Dp


    data object Skinny : PixelButtonSpecs() {

        override val textStyle: TextStyle
            get() = when (type) {
                Type.Default -> TypographyTokens.Medium1
                Type.TextCaps -> TypographyTokens.CapsSmall
                Type.WithIcon -> TypographyTokens.Medium1
                Type.Fill -> TypographyTokens.Medium1
            }
        override val radius: Dp
            get() = when (type) {
                Type.Default -> 6.dp
                Type.TextCaps -> 6.dp
                Type.WithIcon -> 6.dp
                Type.Fill -> 6.dp
            }
        override val minWidth: Dp
            get() = when (type) {
                Type.Default -> 70.dp
                Type.TextCaps -> 70.dp
                Type.WithIcon -> 70.dp
                Type.Fill -> Dp.Infinity
            }
        override val horizontalPadding: Dp
            get() = when (type) {
                Type.Default -> Padding.Default.p3
                Type.TextCaps -> Padding.Default.p3
                Type.WithIcon -> Padding.Default.p3
                Type.Fill -> Padding.Default.p3
            }
        override val verticalPadding: Dp
            get() = when (type) {
                Type.Default -> Padding.Default.p3
                Type.TextCaps -> Padding.Default.p3
                Type.WithIcon -> Padding.Default.p3
                Type.Fill -> Padding.Default.p3
            }
        override val iconPadding: Dp
            get() = when (type) {
                Type.WithIcon, Type.Fill  -> Padding.Default.p4
                else -> Dp.Unspecified
            }
        override val iconSize: Dp
            get() = when(type){
                Type.WithIcon, Type.Fill -> 14.dp
                else -> Dp.Unspecified
            }
    }


    data object Normal : PixelButtonSpecs() {
        override val textStyle: TextStyle
            get() = when (type) {
                Type.Default -> TypographyTokens.Big2
                Type.TextCaps -> TypographyTokens.CapsMedium
                Type.WithIcon -> TypographyTokens.Big2
                Type.Fill -> TypographyTokens.Big2
            }
        override val radius: Dp
            get() = when (type) {
                Type.Default -> 6.dp
                Type.TextCaps -> 6.dp
                Type.WithIcon -> 6.dp
                Type.Fill -> 6.dp
            }
        override val minWidth: Dp
            get() = when (type) {
                Type.Default -> 82.dp
                Type.TextCaps -> 82.dp
                Type.WithIcon -> 82.dp
                Type.Fill -> 82.dp
            }
        override val horizontalPadding: Dp
            get() = when (type) {
                Type.Default -> Padding.Default.p10
                Type.TextCaps -> Padding.Default.p10
                Type.WithIcon -> Padding.Default.p10
                Type.Fill -> Dp.Unspecified
            }
        override val verticalPadding: Dp
            get() = when (type) {
                Type.Default -> Padding.Default.p4
                Type.TextCaps -> Padding.Default.p4
                Type.WithIcon -> Padding.Default.p4
                Type.Fill -> Padding.Default.p4
            }
        override val iconPadding: Dp
            get() = when (type) {
                Type.WithIcon, Type.Fill  -> Padding.Default.p4
                else -> Dp.Unspecified
            }
        override val iconSize: Dp
            get() = when(type){
                Type.WithIcon, Type.Fill -> 16.dp
                else -> Dp.Unspecified
            }
    }

    data object Big : PixelButtonSpecs() {
        override val textStyle: TextStyle
            get() = when (type) {
                Type.Default -> TypographyTokens.Dino3
                Type.TextCaps -> TypographyTokens.CapsBig
                Type.WithIcon -> TypographyTokens.Dino3
                Type.Fill -> TypographyTokens.Dino3
            }
        override val radius: Dp
            get() = when (type) {
                Type.Default -> 6.dp
                Type.TextCaps -> 6.dp
                Type.WithIcon -> 18.dp
                Type.Fill -> 18.dp
            }
        override val minWidth: Dp
            get() = when (type) {
                Type.Default -> 94.dp
                Type.TextCaps -> 94.dp
                Type.WithIcon -> 94.dp
                Type.Fill -> Dp.Infinity
            }
        override val horizontalPadding: Dp
            get() = when (type) {
                Type.Default -> Padding.Default.p11
                Type.TextCaps -> Padding.Default.p11
                Type.WithIcon -> Padding.Default.p11
                Type.Fill -> Dp.Unspecified
            }
        override val verticalPadding: Dp
            get() = when (type) {
                Type.Default -> Padding.Default.p5
                Type.TextCaps -> Padding.Default.p5
                Type.WithIcon -> Padding.Default.p5
                Type.Fill -> Padding.Default.p5
            }
        override val iconPadding: Dp
            get() = when (type) {
                Type.WithIcon, Type.Fill  -> Padding.Default.p5
                else -> Dp.Unspecified
            }
        override val iconSize: Dp
            get() = when(type){
                Type.WithIcon, Type.Fill -> 18.dp
                else -> Dp.Unspecified
            }

    }
}

