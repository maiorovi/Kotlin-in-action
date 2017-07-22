package kotlin_in_action.ch3

import extensions.lastChar
import org.apache.commons.lang3.StringUtils.isEmpty
import extensions.lastChar as last

fun main(args: Array<String>) {
    val set = hashSetOf(1, 2, 3, 4)
    val list = arrayListOf(1, 7, 53)
    val hashMap = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    println(set.javaClass)
    println(list.javaClass)
    println(hashMap.javaClass)

    println(list.last())
    println(set.max())

    val numbers = arrayListOf(1, 2, 3, 4, 5)
    println(numbers) //toString invoked
    // extension type string and extension object is "Kotlin"
    "Kotlin".lastChar()
    // with import alias it also works
    "Kotlin".last()

    //cool; this works extension functions + static apache commons libs
    println("Kotlin".isEmpty())

    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb.toString())

    val list1 = listOf(1,2,3,4)
}

// this language feature of default parameter values allows
// easy overloading of a function
// however you can avoid only trailing parameters,
// or use named parameters feature if you want to avoid parameters arbitrarily
fun <T> joinToString (
        collection: Collection<T>,
        separator:String = ", ",
        prefix:String = "",
        postfix:String = ""
):String {
    val result = StringBuilder()
    result.append(prefix)

    for ((index, elem) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(elem)
    }

    result.append(postfix)

    return result.toString()
}

fun sumWithDescription(vararg elems:Int):Int {
    return elems.sum()
}