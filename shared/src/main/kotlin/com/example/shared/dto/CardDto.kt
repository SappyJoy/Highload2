package com.example.shared.dto

import lombok.Getter
import lombok.RequiredArgsConstructor
import lombok.Setter
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull


@Getter
@Setter
@RequiredArgsConstructor
class CardDto {
    var Person: @NotNull PersonDto? = null
    var Content: @NotEmpty MutableCollection<ContentDto>? = null
}