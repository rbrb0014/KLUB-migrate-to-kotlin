package com.kotlinApiTutorial.entity

import com.kotlinApiTutorial.common.Permission
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity(name = "club_member")
@Table(schema = "klub")
data class ClubMember(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    val id: Long = 0L,

    @ManyToOne(cascade = [CascadeType.PERSIST, CascadeType.MERGE])
    @JoinColumn
    var club: Club,

    @ManyToOne(cascade = [CascadeType.PERSIST, CascadeType.MERGE])
    @JoinColumn
    var user: User,

    var permission: Permission,

    @Column(length = 20)
    var level: String? = null,

    @Column(length = 50)
    var note: String? = null,

    val createdAt: LocalDateTime = LocalDateTime.now(),
    var firedAt: LocalDateTime? = null,
    var deletedAt: LocalDateTime? = null,
)
