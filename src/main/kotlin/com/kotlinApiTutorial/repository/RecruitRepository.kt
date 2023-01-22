package com.kotlinApiTutorial.repository;

import com.kotlinApiTutorial.entity.Recruit
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RecruitRepository : JpaRepository<Recruit, Long> {
}