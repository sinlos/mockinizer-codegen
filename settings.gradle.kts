@file:Suppress("UnstableApiUsage")

rootProject.name = "mockinizer-codegen"

enableFeaturePreview("VERSION_CATALOGS")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            version("kotlin", extra["version.kotlin"] as String)
            version("ksp", extra["version.ksp"] as String)
        }
    }
}

pluginManagement {
    val kotlinVersion = extra["version.kotlin"] as String
    val kspVersion = extra["version.ksp"] as String
    val benManesVersion = extra["version.ben-manes"] as String
    val detektVersion = extra["version.detekt"] as String
    plugins {
        kotlin("jvm") version kotlinVersion
        id("com.github.ben-manes.versions") version benManesVersion
        id("io.gitlab.arturbosch.detekt") version detektVersion
        id("com.google.devtools.ksp") version kspVersion
    }
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

include("annotation")
include("processor")
include("workload")
