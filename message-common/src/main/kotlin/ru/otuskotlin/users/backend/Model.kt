package ru.otuskotlin.users.backend

import java.util.*

data class MessageModel(val id: UUID,
                        val text: String,
                        val createdTime: Date,
                        val owner: UserModel,
                        val likesCount: Int,
                        val parentMessage: MessageModel?)

data class UserModel(val id: UUID,
                     val login: String,
                     val name: String,
                     val rating: Int)