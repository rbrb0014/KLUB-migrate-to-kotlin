package com.kotlinApiTutorial.entity

import com.kotlinApiTutorial.common.Semester
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity(name = "fee")
@Table(schema = "klub")
data class Fee(
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

    var semester: Semester? = null,
    var isPayed: Boolean = false,

    var startAt: LocalDateTime,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    var deletedAt: LocalDateTime? = null,
)
