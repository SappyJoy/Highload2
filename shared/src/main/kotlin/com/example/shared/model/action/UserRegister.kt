package com.example.shared.model.action

import lombok.AllArgsConstructor
import lombok.Data
import lombok.Getter
import lombok.RequiredArgsConstructor


@Getter
@Data
@AllArgsConstructor
@RequiredArgsConstructor
class UserRegister {
    fun getName(): String? {
        return this.name
    }

    @Getter
    private val name: String? = null
    @Getter
    private val phone: String? = null
    @Getter
    private val email: String? = null
    @Getter
    private val password: String? = null
}