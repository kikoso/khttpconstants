package com.enrique.khttpconstants

import junit.framework.TestCase.assertEquals
import org.junit.Test


class HttpStatusCodesTest {

    @Test
    fun `test HTTP Status Codes constants`() {
        // Verifying HTTP status codes
        assertEquals(200, HttpStatusCodes.OK)
        assertEquals(201, HttpStatusCodes.CREATED)
        assertEquals(400, HttpStatusCodes.BAD_REQUEST)
        assertEquals(404, HttpStatusCodes.NOT_FOUND)
        assertEquals(500, HttpStatusCodes.INTERNAL_SERVER_ERROR)
        assertEquals(418, HttpStatusCodes.IM_A_TEAPOT)
    }
}
