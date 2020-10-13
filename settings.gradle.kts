rootProject.name = "private_messages"

pluginManagement {
    val kotlinVersion: String by settings
    plugins {
        kotlin("jvm") version kotlinVersion apply false
//        kotlin("multiplatform") version kotlinVersion apply false
    }
}
include("message-be-common")
include("message-transport-common")
include("message-transport-kafka")
