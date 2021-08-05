rootProject.name = "mockinizer-codegen"

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
includeBuild("included/dependencies") { name = "dependencies" }
includeBuild("included/plugins") { name = "plugins" }
include (":annotation")
include (":processor")
