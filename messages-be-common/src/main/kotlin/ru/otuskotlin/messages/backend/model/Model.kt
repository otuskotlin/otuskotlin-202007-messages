package ru.otuskotlin.messages.backend.model

import java.time.Instant
import java.util.*

data class MessageModel(
        val id: UUID = UUID.randomUUID(),
        val text: String = "",
        val createdTime: Instant = Instant.MIN,
        val receiverId: String = "",
        val senderId: String = "",
        val status: Status = Status.UNREAD,
) {
    companion object {
        val NONE = MessageModel()
    }

}

enum class Status {
    READ,
    UNREAD
}
