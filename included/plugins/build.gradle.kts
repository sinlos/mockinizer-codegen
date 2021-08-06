import rcme.mockinizer.dependencies.Deps

plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    id("the-dependencies")
}

group = "rcme.mockinizer.plugins"
version = "SNAPSHOT"

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation(Deps.detekt.plugin)
    implementation(Deps.kotlin.plugin)
    implementation(Deps.kotlin.ksp.api)
}

gradlePlugin {
    plugins.register("publish-configuration") {
        id = "publish-configuration"
        implementationClass = "rcme.mockinizer.plugins.PublishConfigurationPlugin"
    }
    plugins.register("detekt-configuration") {
        id = "detekt-configuration"
        implementationClass = "rcme.mockinizer.plugins.DetektConfigurationPlugin"
    }
}

