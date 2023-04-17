plugins {
    `kotlin-dsl`
}

group = "io.github.behzod.yukla.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    compileOnly(libs.plugin.gradle.android)
    compileOnly(libs.plugin.gradle.kotlin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
          id = "yukla.android.application"
          implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidLibrary") {
          id = "yukla.android.library"
          implementationClass = "AndroidLibraryConventionPlugin"
        }
    }
}
