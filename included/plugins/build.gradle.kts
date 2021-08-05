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

dependencies {
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.18.0-RC2")
    implementation(kotlin("gradle-plugin"))
    implementation("com.google.devtools.ksp:symbol-processing-api:1.5.21-1.0.0-beta06")
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