package rcme.mockinizer.dependencies

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Versions(
    @SerialName("kotlin_version")
    var kotlin_version: String,

    @SerialName("kotlinx_serialization_version")
    var kotlinx_serialization_version: String,

    @SerialName("kotlinx_coroutines_version")
    var kotlinx_coroutines_version: String,

    @SerialName("ksp_version")
    var ksp_version: String,

    @SerialName("detekt_version")
    var detekt_version: String
)
