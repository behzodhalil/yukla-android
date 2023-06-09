plugins {
  id("yukla.android.library")
  kotlin("plugin.serialization")
  kotlin("kapt")
  id("com.google.dagger.hilt.android")
}

android {
  namespace = "io.behzod.data"


  defaultConfig {
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    consumerProguardFiles("consumer-rules.pro")
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
}

dependencies {

  implementation("androidx.core:core-ktx:1.7.0")
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.0")
  implementation("com.github.yausername.youtubedl-android:library:0.13.2")
  testImplementation("junit:junit:4.13.2")
  androidTestImplementation("androidx.test.ext:junit:1.1.5")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
  implementation("com.tencent:mmkv:1.2.15")
  implementation("com.google.dagger:hilt-android:2.44")
  kapt("com.google.dagger:hilt-android-compiler:2.44")
  implementation ("com.github.yausername.youtubedl-android:ffmpeg:0.14.0") // Optional
  implementation ("com.github.yausername.youtubedl-android:aria2c:0.14.0") // Optional
}
// Allow references to generated code
kapt {
  correctErrorTypes = true
}
