buildscript {

  dependencies {
    classpath("org.jlleitschuh.gradle:ktlint-gradle:10.1.0")
    classpath("com.diffplug.spotless:spotless-plugin-gradle:6.17.0")
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.0")
  }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
@Suppress("DSL_SCOPE_VIOLATION")
plugins {
  alias(libs.plugins.android.application) apply false
  alias(libs.plugins.android.library) apply false
  alias(libs.plugins.kotlin.serialization) apply false
  id("org.jetbrains.kotlin.android") version "1.8.0" apply false
  id("org.jlleitschuh.gradle.ktlint") version "10.1.0"
  id("com.diffplug.spotless") version "6.17.0"
  id("com.google.dagger.hilt.android") version "2.44" apply false
}

tasks {
  register("installGitHook", Copy::class) {
    from(File(rootProject.rootDir, "scripts/git-hooks/pre-commit"))
    into(File(rootProject.rootDir, ".git/hooks"))
    fileMode = 777
  }
  getByPath(":app:preBuild").dependsOn(":installGitHook")
}

ktlint {
  debug.set(false)
  verbose.set(true)
  android.set(true)
  outputToConsole.set(true)
  ignoreFailures.set(false)
  enableExperimentalRules.set(true)
  additionalEditorconfigFile.set(file("$rootDir/.editorconfig"))

  filter {
    exclude("**/generated/**")
    include("**/kotlin/**")
  }
}
