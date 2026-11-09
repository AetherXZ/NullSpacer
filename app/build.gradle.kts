plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.aether.nullspacer"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.aether.nullspacer"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }

    // Java compiler: JVM 17
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    // Kotlin compiler: JVM 17
    kotlinOptions {
        jvmTarget = "17"
    }
}
