package xyx.dvnlabs.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank

@Entity
class User {
    @Id
    @GeneratedValue
    var id: Long? = null

    @Column(name = "USERNAME", length = 20)
    @NotBlank
    lateinit var userName: String

    @Column(name = "PASSWORD")
    lateinit var password: String

    @Column(name = "EMAIL")
    @Email(message = "Not a valid email address!")
    lateinit var email: String


}