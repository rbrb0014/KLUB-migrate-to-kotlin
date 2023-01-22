package com.kotlinApiTutorial.repository;

import com.kotlinApiTutorial.entity.Review
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ReviewRepository : JpaRepository<Review, Long> {
}