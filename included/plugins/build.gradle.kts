import rcme.mockinizer.dependencies.Deps

plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    id("the-dependencies")
}

group = "rcme.mockinizer.plugins"
version = "SNAPSHOT"

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation("rcme.mockinizer.dependencies:dependencies:SNAPSHOT")
    implementation(Deps.detekt.plugin)
    implementation(kotlin("gradle-plugin"))
    implementation("com.google.devtools.ksp:symbol-processing-api:1.5.21-1.0.0-beta06")
}

gradlePlugin {
    plugins.register("publish-configuration") {
        id = "publish-configuration"
        implementationClass = "rcme.mockinizer.plugins.PublishConfigurationPlugin"
    }
    plugins.register("detekt-configuration") {
        id = "detekt-configuration"
        implementationClass = "rcme.mockinizer.plugins.DetektConfigurationPlugin"
    }
}

