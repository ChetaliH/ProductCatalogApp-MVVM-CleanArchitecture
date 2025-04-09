pluginManagement {
    repositories {
        google()  // This is critical for finding Android plugins
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()  // Also needed here
        mavenCentral()
    }
}

rootProject.name = "ProductCatalogApp"
include(":app")