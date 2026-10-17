plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.picklestatspro"
    compileSdk = 34 // Alternatively: compileSdk { version = release(37) } depending on AGP version

    defaultConfig {
        applicationId = "com.example.picklestatspro"
        minSdk = 34
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)

    // Added ConstraintLayout dependency
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
}