package com.enrique.khttpconstants

import junit.framework.TestCase.assertEquals
import org.junit.Test


class HttpHeadersTest {

    @Test
    fun `test HTTP Headers constants`() {
        // Verifying a few HTTP header constants
        assertEquals("Accept", HttpHeaders.ACCEPT)
        assertEquals("Authorization", HttpHeaders.AUTHORIZATION)
        assertEquals("Content-Type", HttpHeaders.CONTENT_TYPE)
        assertEquals("User-Agent", HttpHeaders.USER_AGENT)
        assertEquals("Cookie", HttpHeaders.COOKIE)
    }
}
