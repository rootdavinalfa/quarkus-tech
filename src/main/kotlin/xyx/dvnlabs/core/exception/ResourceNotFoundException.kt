package xyx.dvnlabs.core.exception

data class ResourceNotFoundException(
    var msg: String,
    var thr: Throwable? = null
) : Exception(msg, thr)
