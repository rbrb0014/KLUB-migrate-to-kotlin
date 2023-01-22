package com.kotlinApiTutorial.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity(name = "user")
@Table(schema = "klub")
data class User(
    @Id
    @GeneratedValue()
    var id: Long = 1,

    @Column(length = 20)
    var name: String,

    @Column(length = 20, unique = true)
    var studentId: String,

    @Column(length = 30)
    var phoneNumber: String = "",

    @Column(length = 50, unique = true)
    var email: String,

    @Column(length = 20, nullable = true)
    var department: String? = null,

    @Column(length = 20, nullable = true)
    var nickname: String? = null,

    @Column
    var isAuthenticated: Boolean = false,

    @Column(length = 200)
    var password: String? = null,

    @Column
    var refreshToken: String? = null,

    @Column
    var createdAt: LocalDateTime = LocalDateTime.now(),

    @Column
    var deletedAt: LocalDateTime? = null,
)