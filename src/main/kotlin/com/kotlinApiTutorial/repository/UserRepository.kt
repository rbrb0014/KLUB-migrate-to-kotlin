package com.kotlinApiTutorial.repository

import com.kotlinApiTutorial.dto.UserDto
import com.kotlinApiTutorial.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {
    fun saveThis(user: UserDto) {
        this.save(user.toEntity())
    }

    fun findAllByUserName(name: String)
}