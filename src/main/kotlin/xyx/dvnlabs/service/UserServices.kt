package xyx.dvnlabs.service

import xyx.dvnlabs.entity.User
import xyx.dvnlabs.repository.UserRepository
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject
import javax.transaction.Transactional

@ApplicationScoped
class UserServices {
    @Inject
    private lateinit var userRepository: UserRepository

    @Transactional(rollbackOn = [Exception::class])
    fun save(user: User): User {
        return userRepository.save(user)
    }
}