pluginManagement {
  repositories {
    includeBuild("build-logic")
    gradlePluginPortal()
    google()
    mavenCentral()
  }
  enableFeaturePreview("VERSION_CATALOGS")
}
dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    google()
    mavenCentral()
  }
}
rootProject.name = "Yukla"
include(":app")
include(":data")
include(":features")
include(":features:splash")
include(":features:downloader")
include(":core")
include(":core:ui-components")
