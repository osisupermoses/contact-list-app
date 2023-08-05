package com.osisupermoses.contactlistapp

import androidx.compose.ui.interop.LocalUIViewController
import androidx.compose.ui.window.ComposeUIViewController
import com.osisupermoses.contactlistapp.core.presentation.ImagePickerFactory
import com.osisupermoses.contactlistapp.di.AppModule
import platform.UIKit.UIScreen
import platform.UIKit.UIUserInterfaceStyle

//fun MainViewController() = ComposeUIViewController {
//    val isDarkTheme = UIScreen.mainScreen.traitCollection.userInterfaceStyle ==
//            UIUserInterfaceStyle.UIUserInterfaceStyleDark
//    App(
//        darkTheme = false,
//        dynamicColor = false,
//        appModule = AppModule(),
//        imagePicker = ImagePickerFactory(LocalUIViewController.current).rememberCreatePicker()
//    )
//}