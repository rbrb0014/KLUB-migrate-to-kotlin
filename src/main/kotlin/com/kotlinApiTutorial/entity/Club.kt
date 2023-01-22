package com.kotlinApiTutorial.entity

import com.kotlinApiTutorial.common.Category
import com.kotlinApiTutorial.common.ClubType
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity(name = "club")
@Table(schema = "klub")
data class Club(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    val id: Long = 0L,

    @Column(length = 20, unique = true)
    var name: String,

    var category: Category? = null,
    var type: ClubType? = null,

    @Column(length = 60)
    var description: String? = null,

    @Column(length = 30)
    var location: String? = null,

    val createdAt: LocalDateTime = LocalDateTime.now(),
    var deletedAt: LocalDateTime? = null,

    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn
    @OrderBy("startAt")
    var conferences: MutableList<Conference>,

    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn
    @OrderBy("createdAt")
    var clubMembers: MutableList<ClubMember>,

    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn
    @OrderBy("createdAt")
    var fees: MutableList<Fee>,

    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn
    @OrderBy("createdAt")
    var reviews: MutableList<Review>,

    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn
    @OrderBy("createdAt")
    var recruits: MutableList<Recruit>,
)
