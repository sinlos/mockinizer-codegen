import rcme.mockinizer.dependencies.Deps

plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    id("dependencies")
}

repositories {
    google()
    gradlePluginPortal()
}

dependencies {
    implementation(Deps.kotlin.plugin)
//    implementation(Deps.kotlin.compilerEmbeddable)
//    implementation(Deps.android.plugin)
//    implementation(Deps.jmh.plugin)
    implementation(Deps.detekt.plugin)
//    implementation(Deps.shadow)
//    implementation(Deps.kotlinx.compatibility)
    implementation("rcme.mockinizer.dependencies:dependencies:SNAPSHOT")
}

gradlePlugin {
    plugins.register("configuration") {
        id = "configuration"
        implementationClass = "rcme.mockinizer.configuration.ConfigurationPlugin"
    }
    plugins.register("publish-configuration") {
        id = "publish-configuration"
        implementationClass = "rcme.mockinizer.publish.PublishConfigurationPlugin"
    }
    plugins.register("detekt-configuration") {
        id = "detekt-configuration"
        implementationClass = "rcme.mockinizer.detekt.DetektConfigurationPlugin"
    }
}
