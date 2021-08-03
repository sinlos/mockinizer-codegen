pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
    }
}

includeBuild("includedBuild/dependencies")
includeBuild("includedBuild/gradleConfiguration")

include (":annotation")
include (":processor")
