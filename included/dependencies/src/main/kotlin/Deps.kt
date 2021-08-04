package rcme.mockinizer.dependencies

object Deps {
    const val kotlinVersion = "1.5.30-M1"
    const val detektVersion = "1.17.0"

    val kotlin = Kotlin
    val detekt = Detekt

    object Gradle {

    }

    object Kotlin {
        val stdlib = Stdlib()
        val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"

        class Stdlib {
            val name: String = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
        }
    }

    object Detekt {
        const val plugin = "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:$detektVersion"
        const val ktlint = "io.gitlab.arturbosch.detekt:detekt-formatting:$detektVersion"
    }
}
