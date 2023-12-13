pluginManagement {
  includeBuild("build-logic")
}

rootProject.name = "settings"

sequenceOf("api", "plugin").forEach {
  include("settings-$it")
  project(":settings-$it").projectDir = File(it)
}
