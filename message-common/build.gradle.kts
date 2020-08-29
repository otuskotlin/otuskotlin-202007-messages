plugins {
    kotlin("jvm")
}

group = "ru.otus.otuskotlin.private_messages"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit"))
}
