package string

//we can also define properties on top of file like this
val UNIX_LINE_SEPARATOR = "\n"
// such properties will be accessed in Java code through getters and setters
// if you want to access it like public static field declare it like this
const val WINDOWS_CORE_NAME = "win32"

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