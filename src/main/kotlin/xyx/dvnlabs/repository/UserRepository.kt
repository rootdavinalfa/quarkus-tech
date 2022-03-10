package xyx.dvnlabs.repository

import io.quarkus.hibernate.orm.panache.kotlin.PanacheQuery
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import xyx.dvnlabs.entity.User
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class UserRepository : BaseRepository<User> {

}