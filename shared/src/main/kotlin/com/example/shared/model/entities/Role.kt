package com.example.shared.model.entities

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import lombok.Getter
import lombok.RequiredArgsConstructor
import lombok.Setter
import org.springframework.security.core.GrantedAuthority
import java.io.Serializable
import java.util.*
import javax.persistence.*


@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "`ROLE`")
@JsonIgnoreProperties(ignoreUnknown = true)
class Role : Serializable, GrantedAuthority {
    @Id
    @GeneratedValue
    @Column(name = "role_id")
    private val roleId: UUID? = null

    @Column(name = "rolename")
    private val rolename: String? = null

    @JsonIgnore
    override fun getAuthority(): String {
        return rolename!!
    }
}