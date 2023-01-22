package com.kotlinApiTutorial.repository;

import com.kotlinApiTutorial.entity.Fee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FeeRepository : JpaRepository<Fee, Long> {
}