package com.example.shared.dto

import lombok.Getter
import lombok.RequiredArgsConstructor
import lombok.Setter
import javax.validation.constraints.NotBlank


@Getter
@Setter
@RequiredArgsConstructor
class LoginRequest {
    private val username: @NotBlank String? = null
    private val password: @NotBlank String? = null
    fun getUsername(): @NotBlank String? {
        return this.username
    }
    fun getPassword(): @NotBlank String? {
        return this.password
    }
}