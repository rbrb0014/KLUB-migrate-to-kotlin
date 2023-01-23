package com.kotlinApiTutorial.dto

import com.kotlinApiTutorial.entity.User

data class UserDto(
    val name: String,
    val studentId: String,
    val phoneNumber: String,
    val email: String,
    val department: String?,
    val nickname: String?,
    val isAuthenticated: Boolean,
) {
    fun toEntity(): User {
        return User(
            name = name,
            studentId = studentId,
            phoneNumber = phoneNumber,
            email = email,
            department = department,
            nickname = nickname,
            isAuthenticated = isAuthenticated,
        )
    }
}