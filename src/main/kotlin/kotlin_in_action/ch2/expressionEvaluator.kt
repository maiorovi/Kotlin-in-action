package kotlin_in_action.ch2

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int = when (e) {
    is Num -> {
        println("num: ${e.value}")
        //last statement in block is returned
        e.value
    }
    is Sum -> {
        val left = eval(e.left)
        val right = eval(e.right)
        println("sum: $left + $right")
        left + right
    }

    else -> throw IllegalArgumentException("Unknown Expression")
}
//if (e is Num) {
//    e.value
//} else if (e is Sum) {
//    // smart casts in action; works only with vals and without custom accessors
//    eval(e.left) + eval(e.right)
//} else {
//    throw IllegalArgumentException("Unknown Expression")
//}