package xyx.dvnlabs.controller

import xyx.dvnlabs.core.DefaultResponse
import xyx.dvnlabs.core.util.defaultResponse
import xyx.dvnlabs.entity.Anything
import xyx.dvnlabs.service.AnythingServices
import javax.inject.Inject
import javax.ws.rs.*

@Path("/api/v1/anything")
class AnythingController {

    @Inject
    lateinit var anythingServices: AnythingServices

    @GET
    @Path("/{id}")
    fun findById(
        @PathParam("id") id: Long
    ): DefaultResponse {
        return anythingServices.findById(id).defaultResponse()
    }

    @POST
    @Path("/")
    fun save(
        anything: Anything
    ): DefaultResponse {
        return anythingServices.save(anything).defaultResponse()
    }

    @GET
    @Path("/list")
    fun findAll(
        @DefaultValue("")
        @QueryParam("kindName") kindName: String?
    ): DefaultResponse {
        return anythingServices.searchKindName(kindName ?: "").defaultResponse()
    }

}