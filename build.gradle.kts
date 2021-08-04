//import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSetContainer

allprojects {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.5.30-M1"))
    }
}

//dependencies {
//    implementation("com.squareup:javapoet:1.13.0")
//    implementation("com.google.devtools.ksp:symbol-processing-api:1.5.21-1.0.0-beta06")
//    implementation(project(":annotation"))
//}

//apply(plugin = "rcme.mockinizer.dependencies.mockinizer-dependencies")
//apply(plugin = "mockinizer-properties")
//apply(plugin = "mockinizer-publish")
//apply(plugin = "mockinizer-detekt")

subprojects {
    val module = this
    val moduleName = module.name

//    apply<rcme.mockinizer.dependencies>()

//        apply(plugin = "dependencies")
//        apply(plugin = "the-properties")
//        apply(plugin = "the-publish")
//        apply(plugin = "the-detekt")

//    apply(plugin = "rcme.mockinizer.dependencies.mockinizer-dependencies")
//    apply(plugin = "mockinizer-properties")
//    apply(plugin = "mockinizer-publish")
//    apply(plugin = "mockinizer-detekt")

//    configure<KotlinSourceSetContainer> {
//        sourceSets.getByName("main").kotlin.srcDirs("src/main/kotlin")
//    }
//
//    configure<PublishingExtension> {
//        publications {
//            create<MavenPublication>("annotation") {
//                groupId = "rcme.mockinizer"
//                artifactId = moduleName
//                version = "1.0.$nextVersion"
//
//                from(components.getByName("kotlin"))
//                artifact(tasks.getByName("kotlinSourcesJar"))
//            }
//        }
//        repositories {
//            maven {
//                name = "GitHubPackages"
//                url = uri("https://maven.pkg.github.com/sinlos/repo")
//                credentials {
//                    username = githubProps["gpr.user"] as String?
//                    password = githubProps["gpr.key"] as String?
//                }
//            }
//        }
//    }
}
