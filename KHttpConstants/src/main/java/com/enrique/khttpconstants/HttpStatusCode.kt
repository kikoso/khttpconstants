package com.enrique.khttpconstants

class HttpStatusCodes {
    companion object {
        const val OK = 200 // OK
        const val CREATED = 201 // Created
        const val ACCEPTED = 202 // Accepted
        const val NO_CONTENT = 204 // No Content
        const val MOVED_PERMANENTLY = 301 // Moved Permanently
        const val FOUND = 302 // Found
        const val SEE_OTHER = 303 // See Other
        const val NOT_MODIFIED = 304 // Not Modified
        const val TEMPORARY_REDIRECT = 307 // Temporary Redirect
        const val PERMANENT_REDIRECT = 308 // Permanent Redirect
        const val BAD_REQUEST = 400 // Bad Request
        const val UNAUTHORIZED = 401 // Unauthorized
        const val FORBIDDEN = 403 // Forbidden
        const val NOT_FOUND = 404 // Not Found
        const val METHOD_NOT_ALLOWED = 405 // Method Not Allowed
        const val NOT_ACCEPTABLE = 406 // Not Acceptable
        const val PROXY_AUTHENTICATION_REQUIRED = 407 // Proxy Authentication Required
        const val REQUEST_TIMEOUT = 408 // Request Timeout
        const val CONFLICT = 409 // Conflict
        const val GONE = 410 // Gone
        const val LENGTH_REQUIRED = 411 // Length Required
        const val PRECONDITION_FAILED = 412 // Precondition Failed
        const val PAYLOAD_TOO_LARGE = 413 // Payload Too Large
        const val URI_TOO_LONG = 414 // URI Too Long
        const val UNSUPPORTED_MEDIA_TYPE = 415 // Unsupported Media Type
        const val RANGE_NOT_SATISFIABLE = 416 // Range Not Satisfiable
        const val EXPECTATION_FAILED = 417 // Expectation Failed
        const val IM_A_TEAPOT = 418 // I'm a teapot (April Fools' joke)
        const val MISDIRECTED_REQUEST = 421 // Misdirected Request
        const val UNPROCESSABLE_ENTITY = 422 // Unprocessable Entity
        const val LOCKED = 423 // Locked
        const val FAILED_DEPENDENCY = 424 // Failed Dependency
        const val TOO_EARLY = 425 // Too Early
        const val UPGRADE_REQUIRED = 426 // Upgrade Required
        const val PRECONDITION_REQUIRED = 428 // Precondition Required
        const val TOO_MANY_REQUESTS = 429 // Too Many Requests
        const val REQUEST_HEADER_FIELDS_TOO_LARGE = 431 // Request Header Fields Too Large
        const val UNAVAILABLE_FOR_LEGAL_REASONS = 451 // Unavailable For Legal Reasons
        const val INTERNAL_SERVER_ERROR = 500 // Internal Server Error
        const val NOT_IMPLEMENTED = 501 // Not Implemented
        const val BAD_GATEWAY = 502 // Bad Gateway
        const val SERVICE_UNAVAILABLE = 503 // Service Unavailable
        const val GATEWAY_TIMEOUT = 504 // Gateway Timeout
        const val HTTP_VERSION_NOT_SUPPORTED = 505 // HTTP Version Not Supported
        const val VARIANT_ALSO_NEGOTIATES = 506 // Variant Also Negotiates
        const val INSUFFICIENT_STORAGE = 507 // Insufficient Storage
        const val LOOP_DETECTED = 508 // Loop Detected
        const val NOT_EXTENDED = 510 // Not Extended
        const val NETWORK_AUTHENTICATION_REQUIRED = 511 // Network Authentication Required
    }
}
