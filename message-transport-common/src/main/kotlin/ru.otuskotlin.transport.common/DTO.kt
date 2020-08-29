package ru.otuskotlin.transport.common

import java.util.*

data class UserDTO(val id: UUID, val name: String, val login: String, val rating: Int)

data class MessageDTO(val id: UUID, val text: String, val likesCount: Int, val visibility: Visibility)