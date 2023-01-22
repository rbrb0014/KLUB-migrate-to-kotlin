package com.kotlinApiTutorial.repository

import com.kotlinApiTutorial.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long>