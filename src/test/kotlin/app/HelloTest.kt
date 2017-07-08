package app

import org.junit.Test
import kotlin.test.assertEquals

class HelloTest {
    @Test fun testAssert() : Unit {
        assertEquals("Hello World", getHelloString())
    }
}
