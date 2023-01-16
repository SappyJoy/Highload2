package com.example.highload.controller

import com.example.shared.dto.LoginRequest
import com.example.highload.dto.UserDto
import com.example.highload.model.entities.User
import com.example.highload.security.Jwt
import com.example.highload.service.UserService
import lombok.RequiredArgsConstructor
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid


@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
class AuthController {
    private val authenticationManager: AuthenticationManager? = null
    private val jwt: Jwt? = null
    private val userService: UserService? = null
    @PostMapping("/login")
    fun login(@RequestBody loginRequest: @Valid LoginRequest?): ResponseEntity<Jwt> {
        val authentication = authenticationManager
            ?.authenticate(
                UsernamePasswordAuthenticationToken(
                    loginRequest?.getUsername(),
                    loginRequest?.getPassword()
                )
            )
        SecurityContextHolder.getContext().authentication = authentication
        val user: User = authentication?.principal as User
        val jwt: String = jwt?.generateJwtToken(user.getUserId()) ?:
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(jwt)
    }

    @PostMapping("/sign_up")
    @PreAuthorize("hasAuthority('SUPER_ADMIN')")
    fun signUp(@RequestBody userDto: @Valid UserDto?): ResponseEntity<String> {
        if (userDto != null) {
            userService?.signUpUser(userDto)
        }
        return ResponseEntity
            .status(HttpStatus.OK)
            .body("User created!")
    }
}