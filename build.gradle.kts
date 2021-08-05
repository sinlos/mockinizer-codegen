plugins {
    `kotlin-dsl`
    id("dependencies")
    id("publishing")
    id("detekt-config")
}

group = "rcme.mockinizer.annotation"
version = "SNAPSHOT"

buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    dependencies {
        classpath(kotlin("gradle-plugin"))
    }
}

allprojects {
    group = "rcme.mockinizer"
    version = "SNAPSHOT"

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }

//    plugins {
//
//    }

//    withType(JavaPlugin) {
//        dependencies {
//            testCompile('junit:junit:4.12')
//        }
//    }
}

//apply(plugin = "rcme.mockinizer.dependencies.mockinizer-dependencies")
//apply(plugin = "mockinizer-properties")
//apply(plugin = "mockinizer-publish")
//apply(plugin = "mockinizer-detekt")

subprojects {
    val module = this
    val moduleName = module.name

//    dependencies {
//        compile(project(":annotation"))
//    }

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }

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
