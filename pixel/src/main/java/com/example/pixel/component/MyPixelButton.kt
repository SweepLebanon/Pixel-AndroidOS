package com.example.pixel.component

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.tooling.preview.Preview
import com.example.pixel.theme.PixelTheme
import com.example.pixel.theme.lightColorScheme

@Composable
fun MyPixelButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
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
        shape = ButtonShape,
        elevation = ButtonDefaults.elevatedButtonElevation(
//            defaultElevation = PixelTheme.elevation.default,
//            pressedElevation = PixelTheme.elevation.pressed
            /* disabledElevation = 0.dp */
        ),
        enabled = enabled,
        onClick = onClick,
        modifier = modifier,
        content = {
            ProvideTextStyle(
                value = PixelTheme.typography.big1
            ) {
                content()
            }
        }
    )
}

val ButtonShape = RoundedCornerShape(percent = 50)

@Preview
@Composable
fun MyPixelButtonPreview() {
    PixelTheme(colorScheme = lightColorScheme) {
        MyPixelButton(onClick = { /*TODO*/ }) {
            ProvideTextStyle(value = PixelTheme.typography.big4) {
                Text(
                    text = "Hello", color = PixelTheme.colorScheme.dark8
                )
            }
        }
    }
}
