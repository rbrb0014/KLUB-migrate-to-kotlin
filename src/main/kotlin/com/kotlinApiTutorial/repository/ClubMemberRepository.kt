package com.kotlinApiTutorial.repository;

import com.kotlinApiTutorial.entity.ClubMember
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClubMemberRepository : JpaRepository<ClubMember, Long> {
}