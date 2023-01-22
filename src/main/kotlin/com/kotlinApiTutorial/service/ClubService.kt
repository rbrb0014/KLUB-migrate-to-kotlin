package com.kotlinApiTutorial.service

import com.kotlinApiTutorial.entity.Club
import com.kotlinApiTutorial.repository.ClubRepository
import org.springframework.stereotype.Service

@Service()
class ClubService(
    val clubRepository: ClubRepository
) {
    fun findThemAll(): MutableList<Club> {
        return clubRepository.findAll()
    }

    fun saveThis(club: Club): Club {
        return clubRepository.save(club)
    }
}