plugins {
  id("yukla.android.library")
}

android {
  namespace = "io.behzod.uicomponents"

  defaultConfig {
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    consumerProguardFiles("consumer-rules.pro")
    vectorDrawables {
      useSupportLibrary =  true
    }
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }

  buildFeatures {
    compose = true
  }
  composeOptions {
    kotlinCompilerExtensionVersion = "1.4.1"
  }
  packagingOptions {
    resources {
      excludes += "/META-INF/{AL2.0,LGPL2.1}"
    }
  }
}

dependencies {
  implementation(libs.androidx.core)
  implementation(libs.androidx.compose.ui)
  implementation(libs.androidx.compose.tooling.preview)
  implementation(libs.lifecycle.runtime.ktx)
  implementation(libs.androidx.activity.compose)
  implementation ("androidx.compose.material:material:1.4.1")
  implementation("androidx.compose.material3:material3:1.0.1")
  implementation("androidx.compose.material:material-icons-extended:1.4.1")
  debugImplementation ("androidx.compose.ui:ui-tooling:1.4.1")
  testImplementation("junit:junit:4.13.2")
  androidTestImplementation("androidx.test.ext:junit:1.1.5")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
