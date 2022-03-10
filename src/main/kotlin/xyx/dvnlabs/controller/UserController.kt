package xyx.dvnlabs.controller

import xyx.dvnlabs.core.DefaultResponse
import xyx.dvnlabs.core.util.defaultResponse
import xyx.dvnlabs.entity.User
import xyx.dvnlabs.service.UserServices
import javax.inject.Inject
import javax.ws.rs.POST
import javax.ws.rs.Path

@Path("/api/v1/user")
class UserController {

    @Inject
    lateinit var userServices: UserServices

    @POST
    @Path("/")
    fun save(user: User): DefaultResponse {
        return userServices.save(user).defaultResponse()
    }

}