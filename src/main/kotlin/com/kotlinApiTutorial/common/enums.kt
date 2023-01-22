package com.kotlinApiTutorial.common

//회의 참석 유형
enum class AttendanceType(val attendType: String) {
    ABSENT("ABSENT"),
    ATTEND("ATTEND"),
    LATE("LATE"),
}

//동아리 대분류
enum class Category(val category: String) {
    POLITICS("정치/사회"),
    RELIGION("종교"),
    VOLUNTEER("봉사"),
    SCIENCE("순수과학"),
    IT("IT/공학"),
    ARTSANDSPORTS("예체능"),
    STUDY("STUDY"),
}

//동아리 종류
enum class ClubType(val clubType: String) {
    DEPARTMENT_CLUB("DEPARTMENT_CLUB"),
    CENTRAL_CLUB("CENTRAL_CLUB"),
    UNION_CLUB("UNION_CLUB"),
}

//유저 권한
enum class Permission(val permission: String) {
    USER("USER"),
    ADMIN("ADMIN"),
    SUPERADMIN("SUPERADMIN"),
}

//학기 구분
enum class Semester(val semester: String) {
    SPRING2023("SPRING2023"),
    SUMMER2023("SUMMER2023"),
    FALL2023("FALL2023"),
    WINTER2023("WINTER2023"),
}

//지원 결과
enum class ApplyResult(val applyResult: String) {
    PASS("PASS"),
    FAIL("FAIL"),
    WAIT("WAIT"),
}
