package kotlin_in_action.ch2

import java.util.*

fun whileLoop() {
    var i = 0
    while (i < 10) {
        print("${i}, ")
        i++
    }
}

fun doWhileLook() {
    var i = 10
    do {
        print("${i}, ")
    } while (i-- > 0)
}

fun main(args:Array<String>) {
    whileLoop()
    println()
    doWhileLook()
    println()
    playFizzBuz(1, 100)
    println("\n")
    playFizzBuz(1, 100, 2)
    println("\n")
    iteratingOverTheMap()
}

//range is closed or enclusive; ten is included into range
val oneToTen = 1..10

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun playFizzBuz(start:Int, end:Int, stepSize: Int = 1) {
    for (i in start..end step stepSize) {
        print("${fizzBuzz(i)}")
    }
}

fun iteratingOverTheMap() {
    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'Z') {
        val binaryRepr = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binaryRepr
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}

fun iteratingOverTheList() {
    val list = arrayListOf("10", "11", "1001")

    for ((index, elem) in list.withIndex()) {
        println("$index = $elem")
    }
}

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It`s a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It`s a letter"
    else -> "I don`t know"
}