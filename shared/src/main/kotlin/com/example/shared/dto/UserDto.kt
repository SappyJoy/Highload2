package com.example.shared.dto

import com.example.shared.dto.RoleDto
import lombok.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
class UserDto {
    private val username: @NotBlank String? = null
    private val password: @NotBlank String? = null
    private val roles: @NotEmpty MutableCollection<RoleDto>? = null
}
