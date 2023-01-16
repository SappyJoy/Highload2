package com.example.shared.model.entities

import com.example.shared.model.entities.Person
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
@Table(name = "`MARKET`")
class Market : Serializable {
    @Id
    @GeneratedValue
    @Column(name = "market_id")
    private val raceId: UUID? = null

    @Column(name = "country")
    private val country: @NotBlank(message = "country cannot be empty") String? = null

    @Column(name = "city")
    private val city: @NotBlank(message = "city cannot be empty") String? = null

    @Column
    private val cost: @Min(value = 0) Long? = null

    @ManyToMany(cascade = [CascadeType.MERGE, CascadeType.ALL], fetch = FetchType.EAGER)
    @JoinTable(
        name = "`DRIVER_RACE`",
        joinColumns = [JoinColumn(name = "race_id")],
        inverseJoinColumns = [JoinColumn(name = "driver_id")]
    )
    private val drivers: Collection<Person>? = null
}