package kotlin_in_action.ch2

class Person(val name: String, val isMarried: Boolean)

class Rectangle(val width: Int, val height: Int) {
    val isSquare: Boolean
    get() = height == width

    override fun toString(): String {
        return "Rectangle{ widht = ${width}, height = ${height}}"
    }
}


fun main(args: Array<String>) {
    val person = Person("Bob", true)

    println("Person`s name is: ${person.name}")
    println("Marriage status is: ${person.isMarried}")

    val rectangle = Rectangle(5, 5)
    println("Object ${rectangle} is  square ${rectangle.isSquare}")
}
