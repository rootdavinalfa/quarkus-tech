package xyx.dvnlabs.core.util

import xyx.dvnlabs.core.DefaultResponse

fun Any.defaultResponse(): DefaultResponse {
    return DefaultResponse(
        error = false,
        message = "Success",
        data = this
    )
}