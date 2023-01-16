package com.example.shared.model.entities

import com.example.shared.Rarity
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonManagedReference
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
@Table(name = "`PERSON`")
@JsonIgnoreProperties(ignoreUnknown = true)
class Person : Serializable {
    @Id
    @GeneratedValue
    @Column(name = "person_id")
    private val driverId: UUID? = null

    @Column(name = "firstname")
    private val firstname: @NotBlank(message = "first name cannot be empty") String? = null

    @Column(name = "lastname")
    private val lastname: @NotBlank(message = "last name cannot be empty") String? = null

    @Column(name = "class")
    private val team: @NotBlank(message = "class cannot be empty") String? = null

    @Enumerated(EnumType.STRING)
    @Column(name = "Rarity")
    private val level: Rarity? = null

    @Column(name = "balance")
    private val balance: @Min(value = 0) Long? = null

    @OneToOne(cascade = [CascadeType.MERGE])
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private val user: User? = null

    @OneToOne(cascade = [CascadeType.MERGE], mappedBy = "driver")
    @JsonManagedReference
    private val card: Card? = null
}