group = "rcme.mockinizer.ksp"
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
//    implementation(Square.kotlinPoet)
    implementation(projects.annotation)
//    implementation(libs.ksp.api)
//    implementation(libs.ksp.autoservice)
}

sourceSets.main {
    java.srcDirs("src/main/kotlin")
}
