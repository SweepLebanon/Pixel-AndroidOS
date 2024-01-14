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
//
// @Composable
// fun PixelButton() {
//    FilledTonalButton(onClick = { /*TODO*/ }) {
//        Text(
//            modifier =
//                Modifier.padding(
//                    end = 10.dp,
//                ),
//            text = "Home",
//        )
//        Icon(
//            modifier = Modifier.align(Alignment.CenterVertically),
//            painter = painterResource(R.drawable.ic_chevron_down),
//            contentDescription = null,
//        )
//    }
// }
//
// @Preview(showBackground = true)
// @Composable
// fun PixelButtonPreview() {
//    PixelButton()
// }
//
// @Composable
// fun Greeting(
//    name: String,
//    modifier: Modifier = Modifier,
// ) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier,
//    )
// }
//
// @Preview(showBackground = true)
// @Composable
// fun GreetingPreview() {
//    PixelTheme {
//        Greeting("Android")
//    }
// }
