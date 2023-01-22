package com.kotlinApiTutorial.entity

import com.kotlinApiTutorial.common.Semester
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity(name = "review")
@Table(
    schema = "klub",
    uniqueConstraints = [jakarta.persistence.UniqueConstraint(columnNames = ["club_id", "user_id"])]
)
data class Review(
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

    @Column(length = 20)
    var title: String = "제목없는 리뷰",

    @Column(length = 200)
    var contents: String = "",

    val createdAt: LocalDateTime = LocalDateTime.now(),
    var deletedAt: LocalDateTime? = null,
)
