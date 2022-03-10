package xyx.dvnlabs.core.handler

import xyx.dvnlabs.core.DefaultResponse
import xyx.dvnlabs.core.exception.ResourceNotFoundException
import javax.ws.rs.core.Response
import javax.ws.rs.ext.ExceptionMapper
import javax.ws.rs.ext.Provider

@Provider
class RequestErrorHandlerMapper :
    ExceptionMapper<ResourceNotFoundException> {
    override fun toResponse(exception: ResourceNotFoundException?): Response {
        return Response.status(Response.Status.NOT_FOUND)
            .entity(
                DefaultResponse(
                    error = true,
                    message = exception?.message ?: "Not defined"
                )
            ).build()
    }

}