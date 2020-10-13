package ru.otuskotlin.messages.backend

enum class MessageContextStatus {
    NONE,
    RUNNING,
    FINISHING,
    FAILING,
    SUCCESS,
    ERROR
}
