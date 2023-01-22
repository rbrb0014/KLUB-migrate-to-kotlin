package com.kotlinApiTutorial.entity

import com.kotlinApiTutorial.common.category
import com.kotlinApiTutorial.common.clubType
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity(name = "club")
@Table(schema = "klub")
data class Club(
    @Id
    @GeneratedValue()
    var id: Long = 1,

    @Column(length = 20, unique = true)
    var name: String,

    @Column()
    var category: category? = null,

    @Column()
    var type: clubType? = null,

    @Column(length = 60)
    var description: String? = null,

    @Column(length = 30)
    var location: String? = null,

    @Column
    var createdAt: LocalDateTime = LocalDateTime.now(),

    @Column
    var deletedAt: LocalDateTime? = null,
)
