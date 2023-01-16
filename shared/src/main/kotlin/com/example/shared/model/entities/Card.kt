package com.example.shared.model.entities

import com.fasterxml.jackson.annotation.JsonBackReference
import lombok.Getter
import lombok.RequiredArgsConstructor
import lombok.Setter
import java.io.Serializable
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotEmpty


@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "`CARD`")
class Card : Serializable {
    @Id
    @GeneratedValue
    @Column(name = "card_id")
    private val cardId: UUID? = null

    @OneToOne(cascade = [CascadeType.MERGE])
    @JoinColumn(name = "person_id")
    @JsonBackReference
    private val id: Id? = null

    @ManyToMany(cascade = [CascadeType.MERGE, CascadeType.ALL])
    @JoinTable(
        name = "`CARD_CONTENT`",
        joinColumns = [JoinColumn(name = "card_id")],
        inverseJoinColumns = [JoinColumn(name = "content_id")]
    )
    private val details: @NotEmpty MutableCollection<Content>? = null
}
