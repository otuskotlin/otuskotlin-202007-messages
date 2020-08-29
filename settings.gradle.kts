rootProject.name = "private_messages"

pluginManagement {
    val kotlinVersion: String by settings
    plugins {
        kotlin("jvm") version kotlinVersion apply false
        kotlin("multiplatform") version kotlinVersion apply false
    }
}
include("ok-transport-common")
include("ok-users-backend-common")
include("ok-user-mp-transport-models")