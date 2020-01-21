plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(Versions.compileSdk)
    buildToolsVersion(Versions.buildTools)
    defaultConfig {
        applicationId = "me.aluceps.skeleton"
        minSdkVersion(Versions.minSdk)
        targetSdkVersion(Versions.targetSdk)
        versionCode = Versions.versionCode
        versionName = Versions.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    dataBinding {
        isEnabled = true
    }
}

dependencies {
    implementation(fileTree("dir" to "libs", "include" to listOf("*.jar")))
    implementation(Dependencies.Kotlin.stdlib)

    implementation(Dependencies.AndroidX.appcompat)
    implementation(Dependencies.AndroidX.ktx)
    implementation(Dependencies.AndroidX.recyclerview)
    implementation(Dependencies.AndroidX.constraintlayout)
    implementation(Dependencies.AndroidX.material)

    testImplementation(Dependencies.Test.junit)
    androidTestImplementation(Dependencies.AndroidX.Test.junit)
    androidTestImplementation(Dependencies.AndroidX.Test.espresso)
}
