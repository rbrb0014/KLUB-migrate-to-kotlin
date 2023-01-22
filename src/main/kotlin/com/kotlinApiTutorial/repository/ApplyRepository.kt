package com.kotlinApiTutorial.repository;

import com.kotlinApiTutorial.entity.Apply
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ApplyRepository : JpaRepository<Apply, Long> {
}