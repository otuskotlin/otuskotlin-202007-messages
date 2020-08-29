package ru.otuskotlin.transport.common

import java.util.*

data class MessageDTO(
        val id: UUID,
        val text: String,
        val createdTime: Date,
        val children: List<MessageDTO>,
        val userId: UUID
)

data class PostMessageDTO(
        val id: UUID,
        val text: String,
        val createdTime: Date,
        val userId: UUID
)

data class RemoveMessage(
        val id: UUID,
        val userId: UUID
)

data class PostCommentDTO(
        val id: UUID,
        val text: String,
        val createdTime: Date,
        val parentId: UUID
)

data class UserDTO(
        val id: UUID,
        val name: String,
        val login: String,
        val rating: Int
)
