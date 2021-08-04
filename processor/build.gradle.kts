plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    id("dependencies")
}

group = "rcme.mockinizer.annotation"
version = "SNAPSHOT"

repositories {
    google()
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation(kotlin("gradle-plugin", version = "1.5.20"))
    implementation(project(":annotation"))
    implementation("com.google.devtools.ksp:symbol-processing-api:1.5.21-1.0.0-beta06")
}
