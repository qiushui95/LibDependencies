package son.ysy.dependencies

import kotlin.String
import kotlin.Suppress

@Suppress("MemberVisibilityCanBePrivate","unused","RedundantVisibilityModifier")
sealed class LibPlugins(
  val group: String,
  val name: String,
  val version: String
) {
  object Android : LibPlugins("com.android.tools.build", "gradle", "7.4.2")

  object Kotlin : LibPlugins("org.jetbrains.kotlin", "kotlin-gradle-plugin", "1.8.20") {
    object Android : LibPluginId("kotlin-android")

    object Kapt : LibPluginId("kotlin-kapt")

    object Reflect : LibPluginId("kotlin-reflect")
  }

  object Maven : LibPlugins("com.vanniktech", "gradle-maven-publish-plugin", "0.25.1") {
    object Plugin : LibPluginId("com.vanniktech.maven.publish")
  }

  object Navigation : LibPlugins("androidx.navigation", "navigation-safe-args-gradle-plugin",
      "2.5.3") {
    object Plugin : LibPluginId("androidx.navigation.safeargs.kotlin")
  }

  object RocketX : LibPlugins("io.github.trycatchx", "rocketx", "1.1.1") {
    object Plugin : LibPluginId("com.rocketx")
  }

  object VasDolly : LibPlugins("com.tencent.vasdolly", "plugin", "3.0.6") {
    object Plugin : LibPluginId("com.tencent.vasdolly")
  }
}
