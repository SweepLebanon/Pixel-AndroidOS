import com.android.build.api.dsl.LibraryExtension
import convention.configureAndroidCompose
import convention.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

/*
 * Created by Mohamad Hamade (Vordead) on 3/2/24, 12:38 PM.
 * Last modified 3/2/24, 12:38 PM
 * Copyright (c) 2024.
 * Pixel. All rights reserved.
 */

class AndroidLibraryComposeConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply("com.android.library")
            pluginManager.apply("org.jetbrains.kotlin.android")

            extensions.configure<LibraryExtension> {
                configureAndroidCompose(this)
                configureKotlinAndroid(this)
            }
        }
    }
}
