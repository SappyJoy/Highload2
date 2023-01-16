package com.example.shared.dto

import com.example.shared.Rarity
import lombok.Getter
import lombok.RequiredArgsConstructor
import lombok.Setter
import javax.validation.constraints.Min


@Getter
@Setter
@RequiredArgsConstructor
class PersonDto {
    private val firstname: String? = null
    private val lastname: String? = null
    private val team: String? = null
    private val level: Rarity? = null
    private val salary: @Min(value = 0) Long? = null
}