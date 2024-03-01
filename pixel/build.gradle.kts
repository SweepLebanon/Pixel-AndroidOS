plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("maven-publish")
}

android {
    compileSdk = 34
    namespace = "com.sweep.pixel"

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.2"
    }

    buildTypes {
        release {
            isMinifyEnabled = false

            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_19
        targetCompatibility = JavaVersion.VERSION_19
    }

    defaultConfig {
        minSdk = 33
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        consumerProguardFiles("consumer-rules.pro")
    }

    kotlinOptions {
        jvmTarget = "19"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.ui.tooling)
    implementation(libs.androidx.ui.tooling.preview.android)
    implementation(libs.coil.compose)
    implementation(libs.androidx.ui.util)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.material.icons.extended)

    testImplementation(libs.junit)
}

publishing {
    publications {
        register<MavenPublication>("release") {
            artifactId = "Pixel"
            groupId = "com.sweep"
            version = "1.0.1"

            afterEvaluate {
                from(components["release"])
            }
        }

        repositories {
            maven {
                credentials {
                    username = ""
                    password = ""
                }

                name = "Pixel"
                url = uri("${project.buildDir}/"
                        + "https://github.com/SweepLebanon/Pixel-AndroidOS.git")
            }
        }

        tasks.register<Zip>("generateRepo") {
            val publishTask = tasks.named(
                "publishReleasePublicationToMyrepoRepository",
                PublishToMavenRepository::class.java)
            from(publishTask.map { it.repository.url })
            into("mylibrary")
            archiveFileName.set("mylibrary.zip")
        }

    }
}
