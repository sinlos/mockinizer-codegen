package rcme.mockinizer.plugins

import org.gradle.api.Action
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension

class PropertiesPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.extensions.create("props", PropertiesExtension::class.java, target)
    }

    private fun Project.kotlin(action: Action<KotlinProjectExtension>) {
        extensions.configure(KotlinProjectExtension::class.java, action)
    }
}
