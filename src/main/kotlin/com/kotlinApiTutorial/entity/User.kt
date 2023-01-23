package com.kotlinApiTutorial.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity(name = "user")
@Table(schema = "klub")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    val id: Long = 0L,

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

    @Column(length = 200)
    var password: String? = null,

    var isAuthenticated: Boolean = false,
    var refreshToken: String? = null,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    var deletedAt: LocalDateTime? = null,

    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn
    @OrderBy("createdAt")
    var applies: MutableList<Apply>? = null,

    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn
    @OrderBy("createdAt")
    var attendances: MutableList<Attendance>? = null,

    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn
    @OrderBy("createdAt")
    var clubMembers: MutableList<ClubMember>? = null,

    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn
    @OrderBy("createdAt")
    var fees: MutableList<Fee>? = null,

    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn
    @OrderBy("createdAt")
    var reviews: MutableList<Review>? = null,
)