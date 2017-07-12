package kotlin_in_action.tasks

import java.util.*

fun isPermutation(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) {
        return false
    }

    val charByValues = HashMap(str1.map { c -> Pair(c, 1) }
            .groupBy { pair -> pair.first }
            .mapValues { values ->
                values.value.map { pair -> pair.second }.sum()
            })

    for (ch in str2) {
        if (!charByValues.containsKey(ch)) {
            return false
        }

        val curValue = charByValues[ch]?.minus(1)
        charByValues.set(ch, curValue)
    }

    println(charByValues.toString())

    return charByValues.values.all { it == 0 }
}