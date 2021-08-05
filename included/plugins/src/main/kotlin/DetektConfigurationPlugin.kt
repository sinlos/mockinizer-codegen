package rcme.mockinizer.plugins

import io.gitlab.arturbosch.detekt.CONFIGURATION_DETEKT_PLUGINS
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class DetektConfigurationPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.plugins.apply("io.gitlab.arturbosch.detekt")
        target.extensions.configure(DetektExtension::class.java) {
            input = target.files(
                target
                    .file("src")
                    .listFiles()
                    ?.filter { it.isDirectory && it.name.endsWith("main", ignoreCase = true) }
            )
            config = target.rootProject.files("detekt.yml")
        }
        target.dependencies.add(CONFIGURATION_DETEKT_PLUGINS, "io.gitlab.arturbosch.detekt:detekt-formatting:1.17.0")
    }
}
