pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "KMP_POC"
include(":androidApp")
include(":shared")
include(":androidApp:banking")
project(":androidApp:banking").name = "banking"
include(":androidApp:investing")
include(":shared:domain:banking")
include(":shared:domain:investing")
include(":shared:data:banking")
include(":shared:data:investing")
