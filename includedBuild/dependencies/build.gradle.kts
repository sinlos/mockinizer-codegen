plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

group = "rcme.mockinizer.dependencies"
version = "SNAPSHOT"

repositories {
    jcenter()
}

gradlePlugin {
    plugins.register("dependencies") {
        id = "dependencies"
        implementationClass = "rcme.mockinizer.dependencies.DependenciesPlugin"
    }
}
