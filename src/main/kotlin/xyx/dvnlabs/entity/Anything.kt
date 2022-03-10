package xyx.dvnlabs.entity

import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity
class Anything {
    @Id
    @GeneratedValue
    var id: Long? = null

    @Column(name = "KIND_NAME")
    lateinit var kindName: String

    @Column(name = "QTY", precision = 23, scale = 5)
    lateinit var qty: BigDecimal


}