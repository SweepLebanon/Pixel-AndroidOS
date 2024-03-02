import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import convention.configureAndroidCompose
import convention.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

/*
 * Created by Mohamad Hamade (Vordead) on 3/2/24, 12:34 PM.
 * Last modified 3/2/24, 12:34 PM
 * Copyright (c) 2024.
 * Pixel. All rights reserved.
 */

class AndroidApplicationComposeConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply("com.android.application")
            pluginManager.apply("org.jetbrains.kotlin.android")

            extensions.configure<BaseAppModuleExtension> {
                configureAndroidCompose(this)
                configureKotlinAndroid(this)
            }

        }
    }

}
