/*
 * Created by Mohamad Hamade (Vordead) on 2/19/24, 1:02 AM.
 * Last modified 2/19/24, 12:28 AM
 * Copyright (c) 2024.
 * Pixel. All rights reserved.
 */

package com.example.pixel.component.text

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import com.example.pixel.theme.PixelTheme


/**
 * A wrapper for Material3 Text that takes text with a default Pixel Typography.
 *
 * @param text The text to be displayed.
 * @param modifier Optional modifier for this composable.
 * @param color The color of the text.
 * @param fontSize The size of the font.
 * @param fontStyle The style of the font (normal, italic).
 * @param fontWeight The weight of the font (normal, bold).
 * @param fontFamily The font family to be used.
 * @param letterSpacing The spacing between letters.
 * @param textDecoration The decoration to be applied to the text (e.g., underline).
 * @param textAlign The alignment of the text within its container.
 * @param lineHeight The height of each line of text.
 * @param overflow The handling of text overflow.
 * @param softWrap Whether to allow soft wrapping of the text.
 * @param maxLines The maximum number of lines to be displayed.
 * @param minLines The minimum number of lines to be displayed.
 * @param onTextLayout Callback for when the text layout is calculated.
 * @param style The style of the text.
 */
@Composable
fun PixelText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    onTextLayout: ((TextLayoutResult) -> Unit)? = null,
    style: TextStyle = LocalTextStyle.current
) {
    Text(
        text = text,
        modifier = modifier,
        color = color,
        fontSize = fontSize,
        fontStyle = fontStyle,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        textDecoration = textDecoration,
        textAlign = textAlign,
        lineHeight = lineHeight,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        minLines = minLines,
        onTextLayout = onTextLayout,
        style = style
    )

}


/**
 * A wrapper for Material3 Text that takes annotatedString with a default Pixel Typography.
 *
 * @param annotatedString The annotated string to be displayed.
 * @param modifier Optional modifier for this composable.
 * @param color The color of the text.
 * @param fontSize The size of the font.
 * @param fontStyle The style of the font (normal, italic).
 * @param fontWeight The weight of the font (normal, bold).
 * @param fontFamily The font family to be used.
 * @param letterSpacing The spacing between letters.
 * @param textDecoration The decoration to be applied to the text (e.g., underline).
 * @param textAlign The alignment of the text within its container.
 * @param lineHeight The height of each line of text.
 * @param overflow The handling of text overflow.
 * @param softWrap Whether to allow soft wrapping of the text.
 * @param maxLines The maximum number of lines to be displayed.
 * @param minLines The minimum number of lines to be displayed.
 * @param inlineContent Inline content for the annotated string.
 * @param onTextLayout Callback for when the text layout is calculated.
 * @param style The style of the text.
 */
@Composable
fun PixelText(
    annotatedString: AnnotatedString,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    inlineContent: Map<String, InlineTextContent> = mapOf(),
    onTextLayout: ((TextLayoutResult) -> Unit) = {},
    style: TextStyle = PixelTheme.typography.medium1
) {
    Text(
        text = annotatedString,
        modifier = modifier,
        color = color,
        fontSize = fontSize,
        fontStyle = fontStyle,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        textDecoration = textDecoration,
        textAlign = textAlign,
        lineHeight = lineHeight,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        minLines = minLines,
        inlineContent = inlineContent,
        onTextLayout = onTextLayout,
        style = style
    )
}



@Preview(showBackground = true)
@Composable
private fun PixelTextPreview() {
    Column {
        PixelText(text = "Hello World")
        PixelText(annotatedString = buildAnnotatedString {
            append("Hello Annotated String")
        })
    }
}



