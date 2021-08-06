@file:Suppress("EXPERIMENTAL_API_USAGE", "UNCHECKED_CAST", "ClassName")

package rcme.mockinizer.dependencies

object Deps {

    object versions {
        var kotlin_version = "1.5.30-M1"
        var ksp_version = "1.5.21-1.0.0-beta06"
        var detekt_version = "1.18.0-RC2"
    }

    val nextVersion by lazy { ((java.util.Date().time / 1000) - 1451606400) / 10 }

    object gradle {

    }

    object kotlin {
        val plugin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${versions.kotlin_version}" }
        val stdlib by lazy { "org.jetbrains.kotlin:kotlin-stdlib:${versions.kotlin_version}" }
        object ksp {
            val api by lazy { "com.google.devtools.ksp:symbol-processing-api:${versions.ksp_version}" }
        }
    }

    object detekt {
        val plugin by lazy { "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:${versions.detekt_version}" }
        val ktlint by lazy { "io.gitlab.arturbosch.detekt:detekt-formatting:${versions.detekt_version}" }
    }
}
