package ru.otuskotlin.backend.transport.model

import java.time.Instant
import java.util.*

abstract class MessageSave(
        open val text: String? = null,
        open val createdTime: Instant? = null,
        open val receiverId: String? = null,
        open val senderId: String? = null,
)

data class MessageCreate(
        override val text: String? = null,
        override val createdTime: Instant? = null,
        override val receiverId: String? = null,
        override val senderId: String? = null,
) : MessageSave(text, createdTime, receiverId, senderId)

data class MessageUpdate(
        val id: UUID? = null,
        override val text: String? = null,
        override val createdTime: Instant? = null,
        override val receiverId: String? = null,
        override val senderId: String? = null,
) : MessageSave(text, createdTime, receiverId, senderId)