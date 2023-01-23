package com.kotlinApiTutorial.controller

import com.kotlinApiTutorial.dto.UserDto
import com.kotlinApiTutorial.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController(val userService: UserService) {
    @GetMapping
    fun getUsers(): ResponseEntity<*> {
        val users = userService.findThemAll()

        return ResponseEntity.ok(users);
    }

    @GetMapping("/help")
    fun userHelp(): ResponseEntity<*> {
        return ResponseEntity.ok("helloWorld")
    }

    @PostMapping
    fun setUser(@RequestBody user: UserDto): ResponseEntity<*> {
        val res = userService.saveThis(user);

        return ResponseEntity.ok(res)
    }
}