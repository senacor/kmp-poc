plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.example.kmppoc.android"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.example.kmppoc.android"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
        signingConfig = signingConfigs.getByName("debug") //remove later, just for test to build a release version
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    debugImplementation(project(mapOf("path" to ":androidApp:banking")))
    releaseImplementation(files("./libs/banking-debug-0.3.aar"))
    debugImplementation(project(mapOf("path" to ":androidApp:investing")))
    releaseImplementation(files("./libs/investing-debug-0.3.aar"))


    implementation(project(":shared"))
    implementation("androidx.navigation:navigation-compose:2.5.3")

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.0")
    implementation("androidx.activity:activity-compose:1.6.1")
    implementation("androidx.compose.ui:ui:1.3.3")
    implementation("androidx.compose.ui:ui-tooling-preview:1.3.3")
    implementation("androidx.compose.foundation:foundation:1.3.1")
    implementation("androidx.compose.material:material:1.3.1")
    implementation("androidx.activity:activity-compose:1.6.1")
}