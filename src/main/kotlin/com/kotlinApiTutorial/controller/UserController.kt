package com.kotlinApiTutorial.controller

import com.kotlinApiTutorial.entity.User
import com.kotlinApiTutorial.repository.UserRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController(
    val userRepository: UserRepository
) {
    @GetMapping
    fun getUsers(): ResponseEntity<*> {
        val users = userRepository.findAll()

        return ResponseEntity.ok(users)
    }

    @GetMapping("/help")
    fun userHelp(): ResponseEntity<*> {
        return ResponseEntity.ok("helloWorld")
    }

    @PostMapping
    fun setUser(@RequestBody user: User): ResponseEntity<*> {
        val res = userRepository.save(user)

        return ResponseEntity.ok(res)
    }
}