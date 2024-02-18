/*
 * Created by Mohamad Hamade (Vordead) on 2/19/24, 1:04 AM.
 * Last modified 2/17/24, 8:01 PM
 * Copyright (c) 2024.
 * Pixel. All rights reserved.
 */

package com.sweep.pixel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import com.sweep.pixel.ui.theme.PixelCatalog

class PixelCatalogActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent { PixelCatalog() }
    }
}
