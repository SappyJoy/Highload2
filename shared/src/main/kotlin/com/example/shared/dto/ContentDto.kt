package com.example.shared.dto

import lombok.Getter
import lombok.RequiredArgsConstructor
import lombok.Setter
import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank


@Getter
@Setter
@RequiredArgsConstructor
class ContentDto {
    private val name: @NotBlank String? = null
    private val cost: @Min(value = 0) Long? = null
}