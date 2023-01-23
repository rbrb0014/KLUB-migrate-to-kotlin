package com.kotlinApiTutorial.entity

import com.kotlinApiTutorial.common.ApplyResult
import com.kotlinApiTutorial.common.AttendanceType
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity(name = "apply")
@Table(
    schema = "klub",
    uniqueConstraints = [UniqueConstraint(columnNames = ["recruit_id", "user_id"])]
)
data class Apply(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    val id: Long = 0L,

    @ManyToOne(cascade = [CascadeType.PERSIST, CascadeType.MERGE])
    @JoinColumn
    var recruit: Recruit,

    @ManyToOne(cascade = [CascadeType.PERSIST, CascadeType.MERGE])
    @JoinColumn
    var user: User,

    val result: ApplyResult = ApplyResult.WAIT,
    var attendanceType: AttendanceType,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    var deletedAt: LocalDateTime? = null,
)