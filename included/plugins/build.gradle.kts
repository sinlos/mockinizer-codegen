plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    id("dependencies")
}

group = "rcme.mockinizer.plugins"
version = "SNAPSHOT"

repositories {
    google()
    mavenCentral()
}

gradlePlugin {
    plugins.register("properties") {
        id = "properties"
        implementationClass = "rcme.mockinizer.plugins.PropertiesPlugin"
    }
    plugins.register("publishing") {
        id = "publishing"
        implementationClass = "rcme.mockinizer.plugins.PublishConfigurationPlugin"
    }
    plugins.register("detekt-config") {
        id = "detekt-config"
        implementationClass = "rcme.mockinizer.plugins.DetektConfigurationPlugin"
    }
    plugins.register("defaults") {
        id = "defaults"
        implementationClass = "rcme.mockinizer.plugins.DefaultsPlugin"
    }
}

// kotlin.sourceSets.getByName("main").kotlin.srcDir("../dependencies/src/main/kotlin")