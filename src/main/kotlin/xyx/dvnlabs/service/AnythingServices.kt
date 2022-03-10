package xyx.dvnlabs.service

import xyx.dvnlabs.core.exception.ResourceNotFoundException
import xyx.dvnlabs.entity.Anything
import xyx.dvnlabs.repository.AnythingRepository
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject
import javax.transaction.Transactional

@ApplicationScoped
class AnythingServices {

    @Inject
    lateinit var anythingRepository: AnythingRepository

    fun searchKindName(kindName: String): List<Anything> {
        return anythingRepository.searchByKindName(kindName)
    }

    @Transactional(rollbackOn = [Exception::class])
    fun save(anything: Anything): Anything {
        anythingRepository.persistAndFlush(anything)
        return anything
    }

    @Transactional(rollbackOn = [Exception::class])
    fun delete(id: Long) : Boolean {
        return anythingRepository.deleteById(id)
    }

    fun findById(id : Long) : Anything{
        return anythingRepository.findById(id)
            ?: throw ResourceNotFoundException("Anything with id $id not found!")
    }


}
