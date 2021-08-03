package rcme.mockinizer.ksp

import com.google.devtools.ksp.processing.*
import com.google.devtools.ksp.symbol.KSAnnotated
import rcme.mockinizer.annotation.Mock
import java.io.OutputStream

fun OutputStream.appendText(str: String) {
    this.write(str.toByteArray())
}

class TheProcessor : SymbolProcessor {

    lateinit var codeGenerator: CodeGenerator
    lateinit var logger: KSPLogger

    fun init(options: Map<String, String>, kotlinVersion: KotlinVersion, codeGenerator: CodeGenerator, logger: KSPLogger) {
        this.codeGenerator = codeGenerator
        this.logger = logger
    }

    override fun process(resolver: Resolver): List<KSAnnotated> {
        resolver.getSymbolsWithAnnotation(Mock::class.java.canonicalName).onEach {
            val file = codeGenerator.createNewFile(Dependencies(false), "asd.qwe", it.toString(), "kt")
            file.appendText("ololo")
            file.close()
        }
        return emptyList()
    }
}

class TheProcessorProvider : SymbolProcessorProvider {
    override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor {
        return TheProcessor().apply {
            init(environment.options, environment.kotlinVersion, environment.codeGenerator, environment.logger)
        }
    }
}
