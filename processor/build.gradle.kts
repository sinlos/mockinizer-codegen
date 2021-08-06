import rcme.mockinizer.dependencies.Deps

group = "rcme.mockinizer.annotation"
version = "SNAPSHOT"

dependencies {
    implementation(project(":annotation"))
    implementation(Deps.kotlin.plugin)
    implementation(Deps.kotlin.ksp.api)
}
