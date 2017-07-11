package kotlin_in_action.ch3

import org.junit.Test
import kotlin_in_action.ch3.joinToString
import org.assertj.core.api.Assertions.*;

class CollectionsTest {

    @Test fun concatenatesCollectionWithProvidedPrefixPostfixAndSeparator() {
        val cities = arrayListOf("Moscow", "Kiev", "Lviv")

        val result = joinToString(collection = cities, separator = ",", prefix =  "Cities:{ ", postfix = " }")

        assertThat(result).isEqualTo("Cities:{ Moscow,Kiev,Lviv }")
    }

    @Test
    fun byDefaultJoinIsDoneWithCommasWIthoutPrefixAndPostfix() {
        val cities = arrayListOf("Moscow", "Kiev", "Lviv")

        val result = joinToString(cities)

        assertThat(result).isEqualTo("Moscow, Kiev, Lviv")
    }
}