//import config.Config
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSetContainer
import java.util.*

buildscript {
    repositories {
        google()
        gradlePluginPortal()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.1.0-alpha05")
        classpath(kotlin("gradle-plugin", version = "1.5.20"))
        classpath("com.google.devtools.ksp:com.google.devtools.ksp.gradle.plugin:1.5.21-1.0.0-beta06")
//        classpath("configuration")
    }
}

//val githubProps = file(project.rootDir.absolutePath + "/gradle.properties").inputStream().use { Properties().apply { load(it) } }
//val nextVersion = Config.nextVersion

subprojects {
    val moduleName = this.name

    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "maven-publish")

    configure<KotlinSourceSetContainer> {
        sourceSets.getByName("main").kotlin.srcDirs("src/main/kotlin")
    }

    configure<PublishingExtension> {
        publications {
            create<MavenPublication>("annotation") {
                groupId = "rcme.mockinizer"
                artifactId = moduleName
//                version = "1.0.$nextVersion"

                from(components["java"])
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

    repositories {
        google()
        mavenCentral()
    }
}
