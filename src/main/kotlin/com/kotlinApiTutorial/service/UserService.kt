package com.kotlinApiTutorial.service

import com.kotlinApiTutorial.dto.UserDto
import com.kotlinApiTutorial.entity.User
import com.kotlinApiTutorial.repository.UserRepository
import org.springframework.stereotype.Service

@Service()
class UserService(
    val userRepository: UserRepository
) {
    fun findThemAll(): MutableList<User> {
        return userRepository.findAll()
    }

    fun saveThis(user: UserDto) {
        userRepository.findAllByUserName("")
        return userRepository.saveThis(user.toEntity())
    }
}