package com.ctorres.imageslider

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import com.ctorres.imageslider.components.ImageSliderComponent

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                ImageSliderComponent(
                    images = arrayOf(
                        R.drawable.splash_drawio,
                        R.drawable.splash_drawiob,
                        R.drawable.splash_drawioc
                    )
                )
            }
        }
    }
}