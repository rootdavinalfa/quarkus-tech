package xyx.dvnlabs.core

data class DefaultResponse(
    var error : Boolean = false,
    var data : Any? = null,
    var message : String = ""
)
