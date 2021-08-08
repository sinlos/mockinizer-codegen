import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSetContainer
import rcme.mockinizer.dependencies.Deps.nextVersion

//val libs = project.extensions.getByType<VersionCatalogsExtension>().named("libs") as org.gradle.accessors.dm.LibrariesForLibs

plugins {
    id("the-dependencies") apply false
    id("publish-configuration") apply false
    id("detekt-configuration") apply false
    id("com.github.ben-manes.versions")
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
    apply(plugin = "the-dependencies")
    apply(plugin = "publish-configuration")
    apply(plugin = "detekt-configuration")

    configure<KotlinSourceSetContainer> {
        sourceSets.getByName("main").kotlin.srcDirs("src/main/kotlin")
    }

    configure<PublishingExtension> {
        publications {
            create<MavenPublication>(moduleName) {
                groupId = "rcme.mockinizer"
                artifactId = moduleName
                version = "1.0.$nextVersion"

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
