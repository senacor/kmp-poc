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
include(":androidApp:zahlungsverkehr")

project(":androidApp:zahlungsverkehr").name = "zahlungsverkehr"
include(":androidApp:giro")
include(":shared:logic:zahlungsverkehr")
include(":shared:logic:giro")
include(":shared:data:zahlungsverkehr")
include(":shared:data:giro")
