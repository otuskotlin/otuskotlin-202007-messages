package ru.otuskotlin.users.backend

import java.time.LocalDate

data class UserModel (val id: String = "",
                      var firstName: String = "",
                      var middleName: String = "",
                      var doh: LocalDate = LocalDate.MIN
)
