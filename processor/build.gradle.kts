
group = "rcme.mockinizer.annotation"
version = "SNAPSHOT"

dependencies {
    implementation(project(":annotation"))
    implementation(kotlin("gradle-plugin"))
    implementation("com.google.devtools.ksp:symbol-processing-api:1.5.21-1.0.0-beta06")
}
