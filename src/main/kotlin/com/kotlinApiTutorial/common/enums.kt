package com.kotlinApiTutorial.common

//회의 참석 유형
enum class attendanceType(
    ABSENT: String = "ABSENT",
    ATTEND: String = "ATTEND",
    LATE: String = "LATE",
)

//동아리 대분류
enum class category(
    POLITICS: String = "정치/사회",
    RELIGION: String = "종교",
    VOLUNTEER: String = "봉사",
    SCIENCE: String = "순수과학",
    IT: String = "IT/공학",
    ARTSANDSPORTS: String = "예체능",
    STUDY: String = "STUDY",
)

//동아리 종류
enum class clubType(
    DEPARTMENT_CLUB: String = "DEPARTMENT_CLUB",
    CENTRAL_CLUB: String = "CENTRAL_CLUB",
    UNION_CLUB: String = "UNION_CLUB",
)

//유저 권한
enum class permission(
    USER: String = "USER",
    ADMIN: String = "ADMIN",
    SUPERADMIN: String = "SUPERADMIN",
)

//학기 구분
enum class semester(
    SPRING2023: String = "SPRING2023",
    SUMMER2023: String = "SUMMER2023",
    FALL2023: String = "FALL2023",
    WINTER2023: String = "WINTER2023",
)

//지원 결과
enum class applyResult(
    PASS: String = "PASS",
    FAIL: String = "FAIL",
    WAIT: String = "WAIT",
)
