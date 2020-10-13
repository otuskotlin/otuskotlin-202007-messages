package ru.otuskotlin.messages.backend

import ru.otuskotlin.messages.backend.model.MessageModel

data class MessageContext (
        var requestMessageId: String = "",
        var requestMessage: MessageModel = MessageModel.NONE,
        var responseUser: MessageModel = MessageModel.NONE,
        var status: MessageContextStatus = MessageContextStatus.NONE
)