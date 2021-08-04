package rcme.mockinizer.configuration

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.publish.maven.plugins.MavenPublishPlugin
import org.gradle.jvm.tasks.Jar
import java.net.URI

class PublishConfigurationPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.plugins.apply(MavenPublishPlugin::class.java)
        setupPublishing(target)
        createEmptySourcesJar(target)
    }

    private fun setupPublishing(project: Project) {
        val publishing = project.extensions.getByType(PublishingExtension::class.java)
        publishing.repositories {
            maven {
                name = "sonatype"
                val repositoryId = project.findProperty("sonatype.repository")
                url = URI.create(
                    if (repositoryId != null) {
                        "https://oss.sonatype.org/service/local/staging/deployByRepositoryId/$repositoryId/"
                    } else {
                        "https://oss.sonatype.org/service/local/staging/deploy/maven2/"
                    }
                )
                credentials {
                    username = project.findProperty("sonatype.username").toString()
                    password = project.findProperty("sonatype.password").toString()
                }
            }
        }
        publishing.publications.withType(MavenPublication::class.java).configureEach {
            pom {
                name.set(project.name)
                description.set("Kotlin multi-platform implementation of Reactive Extensions")
                url.set("https://github.com/badoo/Reaktive")

                licenses {
                    license {
                        name.set("Apache-2.0")
                        url.set("https://github.com/badoo/Reaktive/blob/master/LICENSE")
                    }
                }

                developers {
                    developer {
                        id.set("arkivanov")
                        name.set("Arkadii Ivanov")
                        email.set("oss.sonatype@team.bumble.com")
                    }
                }

                scm {
                    connection.set("scm:git:ssh://github.com/badoo/Reaktive.git")
                    developerConnection.set("scm:git:ssh://github.com/badoo/Reaktive.git")
                    url.set("https://github.com/badoo/Reaktive")
                }
            }
        }
    }

    private fun createEmptySourcesJar(project: Project) {
        val task = project.tasks.register("javadocJar", Jar::class.java) {
            archiveClassifier.set("javadoc")
        }
        project
            .extensions
            .getByType(PublishingExtension::class.java)
            .publications
            .withType(MavenPublication::class.java)
            .configureEach { artifact(task.get()) }
    }


}
