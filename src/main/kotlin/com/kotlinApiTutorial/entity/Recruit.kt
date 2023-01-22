package com.kotlinApiTutorial.entity

import com.kotlinApiTutorial.common.Semester
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity(name = "recruit")
@Table(schema = "klub")
data class Recruit(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    val id: Long = 0L,

    @ManyToOne(cascade = [CascadeType.PERSIST, CascadeType.MERGE])
    @JoinColumn(unique = true)
    var club: Club,

    var semester: Semester,

    @Column(length = 3000)
    var title: String,

    var startAt: LocalDateTime,
    var endAt: LocalDateTime? = null,

    var limitation: Int? = null,

    @Column(length = 600)
    var question: String? = null,

    @Column(length = 200)
    var photoUrl: String? = null,

    val createdAt: LocalDateTime = LocalDateTime.now(),
    var updatedAt: LocalDateTime = LocalDateTime.now(),
    var deletedAt: LocalDateTime? = null,

    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn
    @OrderBy("createdAt")
    var applies: MutableList<Apply>,
)
