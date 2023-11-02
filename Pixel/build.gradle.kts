plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("maven-publish")
}

android {
    compileSdk = 33
    namespace = "com.example.pixel"

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
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")

    @Suppress("GradleDependency")
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")

    testImplementation("junit:junit:4.13.2")
}

publishing {
    publications {
        register<MavenPublication>("release") {
            artifactId = "Pixel"
            groupId = "com.sweep"
            version = "1.0.0"

            afterEvaluate {
                from(components["release"])
            }
        }

        repositories {
            maven {
                name = "Pixel"
                url = uri("${project.buildDir}/"
                        + "https://github.com/SweepLebanon/Pixel-AndroidOS.git")
            }
        }
    }
}
