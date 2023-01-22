package com.kotlinApiTutorial.repository;

import com.kotlinApiTutorial.entity.Attendance
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AttendanceRepository : JpaRepository<Attendance, Long> {
}