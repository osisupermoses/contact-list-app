package com.osisupermoses.contactlistapp.core.presentation

import androidx.compose.runtime.Composable

expect class ImagePickerFactory {

    @Composable
    fun rememberCreatePicker(): ImagePicker
}