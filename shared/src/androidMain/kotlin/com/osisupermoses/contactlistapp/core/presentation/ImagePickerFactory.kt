package com.osisupermoses.contactlistapp.core.presentation

import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext

actual class ImagePickerFactory {

    @Composable
    actual fun rememberCreatePicker(): ImagePicker {
        val activity = LocalContext.current as ComponentActivity
        return remember { ImagePicker(activity) }
    }
}