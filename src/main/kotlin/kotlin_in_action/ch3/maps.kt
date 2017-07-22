package kotlin_in_action.ch3

fun main(args:Array<String>) {
    val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    parsePath("C:/Program File/Mongo/bin/mongod.exe")
}

fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir: $directory, name: $fileName, ext: $extension")
}
