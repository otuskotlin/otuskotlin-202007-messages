package ru.otuskotlin.backend.transport.model

import java.time.Instant
import java.util.*

data class Message(
        val id: UUID? = null,
        val text: String? = null,
        val createdTime: Instant? = null,
        val receiverId: String? = null,
        val senderId: String? = null,
        val status: Status? = null,
)

enum class Status {
    READ,
    UNREAD,
    UNAVAILABLE
}