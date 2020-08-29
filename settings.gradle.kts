rootProject.name = "private_messages"
include(":ok-users-backend-common")

pluginManagement {
    plugins {
        val kotlinVersion: String by settings

        kotlin("jvm") version kotlinVersion apply false
        kotlin("multiplatform") version kotlinVersion apply false
    }
}
include("ok-user-mp-transport-models")