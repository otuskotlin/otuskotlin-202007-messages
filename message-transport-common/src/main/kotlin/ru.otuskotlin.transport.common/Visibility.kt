package ru.otuskotlin.transport.common

import java.io.Serializable

enum class Visibility(val value: String) : Serializable {
    PRIVATE("private"),
    PUBLIC("public")
}