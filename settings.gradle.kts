rootProject.name = "private_messages"

pluginManagement {
    val kotlinVersion: String by settings
    plugins {
        kotlin("jvm") version kotlinVersion apply false
//        kotlin("multiplatform") version kotlinVersion apply false
    }
}
include("messages-be-common")
include("messages-transport-models")
include("messages-transport-kafka")
