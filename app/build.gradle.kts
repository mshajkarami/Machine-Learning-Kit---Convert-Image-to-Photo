plugins {
    alias(libs.plugins.android.application)
    id("com.google.gms.google-services")
}

android {
    namespace = "ir.hajkarami.kml_imagetophoto"
    compileSdk = 35

    defaultConfig {
        applicationId = "ir.hajkarami.kml_imagetophoto"
        minSdk = 24
        targetSdk = 35
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

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
//    implementation(libs.vision.common)
//    implementation(libs.play.services.mlkit.text.recognition)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    // Import the firebase
    implementation(platform("com.google.firebase:firebase-bom:33.12.0"))
    implementation("com.google.firebase:firebase-analytics")
    // Add google ml kit
//    implementation("com.google.firebase:firebase-ml-vision:24.0.3")
    implementation("com.google.mlkit:text-recognition:16.0.0-beta3")
//    implementation(libs.text.recognition)
    // To recognize Latin script
    implementation ("com.google.mlkit:text-recognition:16.0.1")
    implementation ("com.google.mlkit:text-recognition-chinese:16.0.1")
    implementation ("com.google.mlkit:text-recognition-devanagari:16.0.1")
    implementation ("com.google.mlkit:text-recognition-japanese:16.0.1")
    implementation ("com.google.mlkit:text-recognition-korean:16.0.1")

}