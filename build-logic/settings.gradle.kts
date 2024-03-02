/*
 * Created by Mohamad Hamade (Vordead) on 3/2/24, 2:25 AM.
 * Last modified 3/2/24, 2:20 AM
 * Copyright (c) 2024.
 * Pixel. All rights reserved.
 */

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}
rootProject.name = "build-logic"
include(":convention")
