package kotlin_in_action.tasks

import org.junit.Test
import org.assertj.core.api.Assertions.*

class IsPermutationTest {

    @Test fun stringWithDifferentLenthIsNotPermutation() {
        assertThat(isPermutation("abdd", "")).isFalse()
    }

    @Test fun theSameStringIsPermutationOfEachOther() {
        assertThat(isPermutation("abcdeeeabb", "abcdeeeabb")).isTrue()
    }

    @Test fun isPermutationOfEachOther() {
        assertThat(isPermutation("abcdeeeabb", "bcabdeeaeb")).isTrue()
    }

    @Test fun NotisPermutationOfEachOther() {
        assertThat(isPermutation("abcdeeeabb", "bcabdetaeb")).isFalse()
    }
}