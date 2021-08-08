package rcme.mockinizer.annotation

@MustBeDocumented
@Target(AnnotationTarget.PROPERTY)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class Mock(
    val value: String = ""
)
