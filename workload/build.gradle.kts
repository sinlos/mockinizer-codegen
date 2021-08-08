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
//    libs.ksp.api.get()
//    implementation(libs.kotlin.gradle.pg)
//    implementation(projects.annotation)
//    implementation(projects.processor)
//    implementation(libs.ksp.api)
//    implementation(libs.ksp.autoservice)
//    ksp(libs.ksp.autoservice)
//    ksp(projects.processor)
}

sourceSets.main {
    java.srcDirs("src/main/kotlin")
}
