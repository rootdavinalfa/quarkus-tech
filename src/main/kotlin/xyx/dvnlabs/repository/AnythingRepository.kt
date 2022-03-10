package xyx.dvnlabs.repository

import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import io.quarkus.panache.common.Parameters
import xyx.dvnlabs.entity.Anything
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class AnythingRepository : PanacheRepository<Anything> {
    fun searchByKindName(kindName: String) =
        list("KIND_NAME LIKE CONCAT('%',:name,'%')", Parameters.with("name", kindName))
}