import rcme.mockinizer.dependencies.Deps

plugins {
    id("org.jetbrains.kotlin.jvm")
    id("publish-configuration")
    id("detekt-configuration")
}

//group = reaktive_group_id
//version = reaktive_version
//
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
    implementation("com.jakewharton.timber:timber:4.7.1")
}
