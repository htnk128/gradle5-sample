import org.gradle.api.JavaVersion
import org.gradle.kotlin.dsl.embeddedKotlinVersion

object Versions {

    val java: JavaVersion = JavaVersion.VERSION_1_8
    val kotlin: String = embeddedKotlinVersion

    const val ktlint: String = "8.0.0"

    const val springBoot: String = "2.1.5.RELEASE"

    const val jackson: String = "2.9.9"
    const val swagger: String = "2.9.2"
    const val mysqlDriver: String = "5.1.47"
    const val flyway: String = "5.2.4"
    const val mybatisSpringBootStarter: String = "2.0.1"

    const val junit: String = "5.4.2"
    const val mockitoKotlin: String = "2.1.0"
}
