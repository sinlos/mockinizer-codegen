package rcme.mockinizer.configuration

import org.gradle.api.Action
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class ConfigurationPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.extensions.create("configuration", ConfigurationExtension::class.java, target)
    }

    private fun Project.kotlin(action: Action<KotlinMultiplatformExtension>) {
        extensions.configure(KotlinMultiplatformExtension::class.java, action)
    }
}
