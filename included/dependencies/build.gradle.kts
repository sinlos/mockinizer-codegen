plugins {
    `java-gradle-plugin`
    kotlin("jvm") version "1.5.30-M1"
}

group = "rcme.mockinizer.dependencies"
version = "SNAPSHOT"

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation(kotlin("gradle-plugin"))
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-properties:1.2.2")
}

gradlePlugin {
    plugins.register("the-dependencies") {
        id = "the-dependencies"
        implementationClass = "rcme.mockinizer.dependencies.DependenciesPlugin"
    }
}
