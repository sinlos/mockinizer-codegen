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
}

gradlePlugin {
    plugins.register("the-dependencies") {
        id = "the-dependencies"
        implementationClass = "rcme.mockinizer.dependencies.DependenciesPlugin"
    }
}
