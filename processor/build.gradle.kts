plugins {
    kotlin("jvm")
    id("dependencies")
    id("detekt-config")
}

group = "rcme.mockinizer.annotation"
version = "SNAPSHOT"

repositories {
    google()
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation(project(":annotation"))
    implementation(kotlin("gradle-plugin"))
    implementation("com.google.devtools.ksp:symbol-processing-api:1.5.21-1.0.0-beta06")
}
