package com.example.shared.dto

import com.example.shared.model.entities.Person
import lombok.Getter
import lombok.RequiredArgsConstructor
import lombok.Setter
import java.util.*


@Getter
@Setter
@RequiredArgsConstructor
class MarketDto {
    private val raceId: UUID? = null
    private val country: String? = null
    private val city: String? = null
    private val cost: Long? = null
    private val drivers: Set<Person>? = null
}