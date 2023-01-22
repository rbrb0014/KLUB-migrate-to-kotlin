package com.kotlinApiTutorial.repository;

import com.kotlinApiTutorial.entity.Club
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClubRepository : JpaRepository<Club, Long> {
}