package rcme.mockinizer.plugins

import org.gradle.api.Project
import javax.inject.Inject

open class PropertiesExtension @Inject constructor(
    private val project: Project
) {

}
