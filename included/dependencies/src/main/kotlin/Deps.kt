@file:Suppress("EXPERIMENTAL_API_USAGE", "UNCHECKED_CAST", "ClassName")

package rcme.mockinizer.dependencies

object Deps {

    object versions {
        var kotlin_version = "1.5.21"
        var ksp_version = "1.5.21-1.0.0-beta06"
        var detekt_version = "1.18.0-RC2"
    }

    val nextVersion by lazy { ((java.util.Date().time / 1000) - 1451606400) / 10 }

    object gradle {

    }

    object kotlin {
        val version = versions.kotlin_version
        val plugin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:$version" }
        val stdlib by lazy { "org.jetbrains.kotlin:kotlin-stdlib:$version" }
        object ksp {
            val version = versions.ksp_version
            val api by lazy { "com.google.devtools.ksp:symbol-processing-api:$version" }
        }
    }

    object detekt {
        val version = versions.detekt_version
        val plugin by lazy { "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:$version" }
        val ktlint by lazy { "io.gitlab.arturbosch.detekt:detekt-formatting:$version" }
    }
}
