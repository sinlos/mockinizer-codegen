import io.gitlab.arturbosch.detekt.detekt
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSetContainer

//val libs = project.extensions.getByType<VersionCatalogsExtension>().named("libs") as org.gradle.accessors.dm.LibrariesForLibs

plugins {
    kotlin("jvm") apply false
    id("com.github.ben-manes.versions")
    id("io.gitlab.arturbosch.detekt")
}

detekt {
    config = files("detekt.yml")
}

subprojects {
    val module = this
    val moduleName = module.name

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }

    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "org.gradle.maven-publish")

    configure<KotlinSourceSetContainer> {
        sourceSets.getByName("main").kotlin.srcDirs("src/main/kotlin")
    }

    configure<PublishingExtension> {
        publications {
            create<MavenPublication>(moduleName) {
                groupId = "rcme.mockinizer"
                artifactId = moduleName
//                version = "1.0.$nextVersion"

                from(components.getByName("kotlin"))
                artifact(tasks.getByName("kotlinSourcesJar"))
            }
        }
        repositories {
            maven {
                name = "GitHubPackages"
                url = uri("https://maven.pkg.github.com/sinlos/repo")
//                credentials {
//                    username = githubProps["gpr.user"] as String?
//                    password = githubProps["gpr.key"] as String?
//                }
            }
        }
    }
}
