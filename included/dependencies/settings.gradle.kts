@file:Suppress("UnstableApiUsage")

enableFeaturePreview("VERSION_CATALOGS")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

//val kotlinVersion: String by settings
//val kspVersion: String by settings

val kotlinVersion = "1.5.21"
val kspVersion = "1.5.21-1.0.0-beta06"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            version("kotlin", kotlinVersion)
            version("ksp", kspVersion)
//            from(files("libs.versions.toml"))
        }
    }
}
