import rcme.mockinizer.dependencies.Deps

plugins {
    id("org.jetbrains.kotlin.jvm")
    id("publish-configuration")
    id("detekt-configuration")
}

group = "reaktive_group_id"
version = "reaktive_version"

//publishing {
//    publications {
//        jvm(MavenPublication) {
//            from components.java
//            artifact kotlinSourcesJar
//        }
//    }
//}

dependencies {
//    implementation Deps.kotlin.stdlib.jdk7
//dependencies {
    implementation("com.squareup:javapoet:1.13.0")
    implementation("com.google.devtools.ksp:symbol-processing-api:1.5.21-1.0.0-beta06")
    implementation(project(":annotation"))
}
