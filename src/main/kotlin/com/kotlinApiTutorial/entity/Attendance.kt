package com.kotlinApiTutorial.entity

import com.kotlinApiTutorial.common.AttendanceType
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity(name = "attendance")
@Table(schema = "klub")
data class Attendance(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    val id: Long = 0L,

    @ManyToOne(cascade = [CascadeType.PERSIST, CascadeType.MERGE])
    @JoinColumn
    var conference: Conference,

    @ManyToOne(cascade = [CascadeType.PERSIST, CascadeType.MERGE])
    @JoinColumn
    var user: User,

    var attendanceType: AttendanceType,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    var deletedAt: LocalDateTime? = null,
)