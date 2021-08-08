@file:Suppress("UnstableApiUsage")

plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    `version-catalog`
    `maven-publish`
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

catalog {
    // declare the aliases, bundles and versions in this block
    versionCatalog {
        alias("my-lib").to("com.mycompany:mylib:1.2")
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["versionCatalog"])
        }
    }
}