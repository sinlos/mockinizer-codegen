package rcme.mockinizer.configuration

import org.gradle.api.Project
import javax.inject.Inject

open class ConfigurationExtension @Inject constructor(
    private val project: Project
) {

}
