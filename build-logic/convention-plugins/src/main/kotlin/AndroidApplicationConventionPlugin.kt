import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.CommonExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.plugins.ExtensionAware
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.provideDelegate
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions

class AndroidApplicationConventionPlugin : Plugin<Project> {

  override fun apply(target: Project) {
    with(target) {
      with(pluginManager) {
        apply("com.android.application")
        apply("org.jetbrains.kotlin.android")
      }

      extensions.configure<ApplicationExtension> {
        configureKotlinAndroid(this)
        defaultConfig.targetSdk = 33
      }
    }
  }
}

internal fun Project.configureKotlinAndroid(
  commonExtension: CommonExtension<*, *, *, *>,
) {
  commonExtension.apply {
    compileSdk = 33

    defaultConfig {
      minSdk = 21
    }

    compileOptions {
      sourceCompatibility = JavaVersion.VERSION_11
      targetCompatibility = JavaVersion.VERSION_11
      isCoreLibraryDesugaringEnabled = true
    }

    kotlinOptions {
      // Treat all Kotlin warnings as errors (disabled by default)
      // Override by setting warningsAsErrors=true in your ~/.gradle/gradle.properties
      val warningsAsErrors: String? by project
      allWarningsAsErrors = warningsAsErrors.toBoolean()

      // Set JVM target to 11
      jvmTarget = JavaVersion.VERSION_11.toString()
    }
  }
  val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

  dependencies {
    add("coreLibraryDesugaring", libs.findLibrary("android.desugar.jdklibs").get())
  }
}

fun CommonExtension<*, *, *, *>.kotlinOptions(block: KotlinJvmOptions.() -> Unit) {
  (this as ExtensionAware).extensions.configure("kotlinOptions", block)
}
