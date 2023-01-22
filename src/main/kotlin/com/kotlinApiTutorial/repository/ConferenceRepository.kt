package com.kotlinApiTutorial.repository;

import com.kotlinApiTutorial.entity.Conference
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ConferenceRepository : JpaRepository<Conference, Long> {
}