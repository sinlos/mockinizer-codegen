rootProject.name = "mockinizer-codegen"

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

includeBuild("included/dependencies")
includeBuild("included/plugins")
include (":annotation")
include (":processor")
