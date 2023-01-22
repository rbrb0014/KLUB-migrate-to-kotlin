package com.kotlinApiTutorial.entity

import com.kotlinApiTutorial.common.Semester
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity(name = "conference")
@Table(schema = "klub")
data class Conference(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    val id: Long = 0L,

    @ManyToOne(cascade = [CascadeType.PERSIST, CascadeType.MERGE])
    @JoinColumn
    var club: Club,

    @Column(length = 40)
    var title: String,

    @Column()
    var semester: Semester,
    var startAt: LocalDateTime,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    var deletedAt: LocalDateTime? = null,

    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn
    @OrderBy("startAt")
    var attendances: MutableList<Attendance>,
)