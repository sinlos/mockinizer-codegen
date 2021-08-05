@file:Suppress("EXPERIMENTAL_API_USAGE", "UNCHECKED_CAST", "ClassName")

package rcme.mockinizer.dependencies

import kotlinx.serialization.properties.Properties
import kotlinx.serialization.properties.decodeFromMap
import org.gradle.api.Project

object Deps {

    lateinit var versions: Versions

    fun init(project: Project) {
        if (::versions.isInitialized) return
//        val findProperty = project.findProperty("kotlinx_serialization_version")
//        val vers = kotlin.runCatching { Properties.decodeFromMap<Versions>(project.properties as Map<String, Any>) }
        val vers = Properties.decodeFromMap<Versions>(project.properties as Map<String, Any>)
        versions = vers
/*
        println("====== ${vers.isSuccess}")
        if (vers.isSuccess) {
            versions = vers.getOrThrow()
        }
*/
    }

    val nextVersion by lazy { ((java.util.Date().time / 1000) - 1451606400) / 10 }

    object Gradle {

    }

    object kotlin {
        val plugin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${versions.kotlin_version}" }
        val stdlib by lazy { "org.jetbrains.kotlin:kotlin-stdlib:${versions.kotlin_version}" }
    }

    object detekt {
        val plugin by lazy { "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:${versions.detekt_version}" }
        val ktlint by lazy { "io.gitlab.arturbosch.detekt:detekt-formatting:${versions.detekt_version}" }
    }
}
