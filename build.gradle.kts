plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    kotlin("multiplatform").apply(false)
    id("com.android.application").apply(false)
    id("com.android.library").apply(false)
    id("org.jetbrains.compose").apply(false)
}

buildscript {
    val agp_version by extra("8.1.0")
    val sqlDelight_version by extra("2.0.0")
    dependencies {
        classpath("app.cash.sqldelight:gradle-plugin:$sqlDelight_version")
        classpath("com.android.tools.build:gradle:$agp_version")
    }
}
