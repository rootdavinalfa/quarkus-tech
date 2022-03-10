package xyx.dvnlabs.repository

import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository

interface BaseRepository<T : Any> : PanacheRepository<T> {

    fun save(entity: T, flush: Boolean = false): T {
        if (flush) {
            persistAndFlush(entity)
        } else {
            persist(entity)
        }
        return entity
    }

}