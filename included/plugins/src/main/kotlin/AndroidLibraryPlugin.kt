package rcme.mockinizer.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidLibraryPlugin: Plugin<Project> {

    override fun apply(target: Project) = target.applyAndroid()

    private fun Project.applyAndroid() {
        plugins.run {
            apply("com.android.library")
            apply("kotlin-android")

        }
//        android {
//
//        }
    }
}