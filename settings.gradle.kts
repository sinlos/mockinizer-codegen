@file:Suppress("UnstableApiUsage")

rootProject.name = "mockinizer-codegen"

enableFeaturePreview("VERSION_CATALOGS")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
//
//val kotlinVersion: String by settings
//val kspVersion: String by settings
//
//dependencyResolutionManagement {
//    versionCatalogs {
//        create("libs") {
//            version("kotlin", kotlinVersion)
//            version("ksp", kspVersion)
//        }
//    }
//}

includeBuild("included/dependencies")

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(gradle.includedBuild("included/dependencies"))
        }
    }
}

pluginManagement {
    plugins {
        id("com.github.ben-manes.versions") version "0.38.0"
    }

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }

    resolutionStrategy {
        val kspVersion: String by settings
        eachPlugin {
            when (requested.id.id) {
                "symbol-processing" -> useModule("com.google.devtools.ksp:symbol-processing:$kspVersion")
                "com.google.devtools.ksp" -> useVersion(kspVersion)
            }
        }
    }
}

includeBuild("included/plugins")
include("annotation")
include("processor")
include("workload")
