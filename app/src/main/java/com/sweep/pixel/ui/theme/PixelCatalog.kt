package com.sweep.pixel.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.add
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pixel.component.PixelButton
import com.example.pixel.theme.PixelTheme

/**
 * Pixel component catalog.
 */
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun PixelCatalog() {
    AppCatalogTheme {
        val contentPadding =
            WindowInsets.systemBars.add(
                WindowInsets(
                    left = 16.dp,
                    top = 16.dp,
                    right = 16.dp,
                    bottom = 16.dp,
                ),
            ).asPaddingValues()
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = contentPadding,
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            item {
                Text(
                    text = "Pixel Catalog",
                    style = PixelTheme.typography.big1,
                )
            }
            item { Text("Buttons", Modifier.padding(top = 16.dp)) }
            item {
                FlowRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                    PixelButton(onClick = { /*TODO*/ }) {
                        Text(text = "Hello World")
                    }
                }
            }
            item { Text("Disabled buttons", Modifier.padding(top = 16.dp)) }
            item {
                FlowRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                    // TODO: Implement disabled PixelButtons
                }
            }
            item { Text("Buttons with leading icons", Modifier.padding(top = 16.dp)) }
            item {
                FlowRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                    // TODO: Implement PixelButtons with leading icons
                }
            }
            item { Text("Disabled buttons with leading icons", Modifier.padding(top = 16.dp)) }
            item {
                FlowRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                    // TODO: Implement disabled PixelButtons with leading icons
                }
            }
            item { Text("Dropdown menus", Modifier.padding(top = 16.dp)) }
            item {
                FlowRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                    // TODO: Implement PixelDropDown
                }
            }
            item { Text("Chips", Modifier.padding(top = 16.dp)) }
            item {
                FlowRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                    // TODO: Implement PixelChips
                }
            }
            item { Text("Icon buttons", Modifier.padding(top = 16.dp)) }
            item {
                FlowRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                    // TODO: Implement PixelIconButtons
                }
            }
            item { Text("View toggle", Modifier.padding(top = 16.dp)) }
            item {
                FlowRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                    // TODO: Implement PixelViewToggle
                }
            }
            item { Text("Tags", Modifier.padding(top = 16.dp)) }
            item {
                FlowRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                    // TODO: Implement Pixel Tags
                }
            }
            item { Text("Tabs", Modifier.padding(top = 16.dp)) }
            item {
                // TODO: Implement PixelTabRow
            }
            item { Text("Navigation", Modifier.padding(top = 16.dp)) }
            item {
                // TODO: Implement PixelNavigationBar
            }
        }
    }
}
