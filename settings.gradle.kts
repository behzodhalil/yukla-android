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
