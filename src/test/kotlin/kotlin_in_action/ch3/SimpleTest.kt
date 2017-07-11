package kotlin_in_action.ch3

import org.junit.Test
import string.joinToString;

class SimpleTest {

    @Test fun testFunctionCallOnTopLevel() {
        val string = arrayListOf("input", "input1", "input2")
        val joinedCollection = joinToString(string)
    }
}