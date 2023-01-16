package com.example.shared.model.entities

import lombok.Getter
import lombok.RequiredArgsConstructor
import lombok.Setter
import java.io.Serializable
import java.util.*
import javax.persistence.*
import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank


@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "`CONTENT`")
class Content : Serializable {
    @Id
    @GeneratedValue
    @Column(name = "Content_id")
    private val detailId: UUID? = null

    @Column(name = "name")
    private val name: @NotBlank(message = "content cannot be empty") String? = null

    @Column(name = "cost")
    private val cost: @Min(value = 1) Long? = null
}