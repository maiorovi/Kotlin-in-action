package extensions

import org.apache.commons.lang3.StringUtils

fun String.lastChar(): Char = this.get(this.length - 1)

fun String.isEmpty(): Boolean = StringUtils.isEmpty(this)

//extension functions can`t break incapsulation. so they can`t use private and protected
// class members. also you can override extension functions

// extension properties
var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }