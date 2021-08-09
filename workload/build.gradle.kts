group = "rcme.mockinizer.workload"
version = "SNAPSHOT"

plugins {
    id("com.google.devtools.ksp")
    kotlin("jvm")
}

repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation(projects.annotation)
    implementation(projects.processor)
    ksp(projects.processor)
}
