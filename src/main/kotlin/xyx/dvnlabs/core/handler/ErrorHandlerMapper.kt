package xyx.dvnlabs.core.handler

import xyx.dvnlabs.core.DefaultResponse
import javax.ws.rs.core.Response
import javax.ws.rs.ext.ExceptionMapper
import javax.ws.rs.ext.Provider

@Provider
class ErrorHandlerMapper : ExceptionMapper<Exception> {
    override fun toResponse(exception: Exception?): Response {
        return Response.status(Response.Status.NOT_FOUND)
            .entity(
                DefaultResponse(
                    error = true,
                    message = exception?.message ?: "Not defined"
                )
            ).build()
    }

}