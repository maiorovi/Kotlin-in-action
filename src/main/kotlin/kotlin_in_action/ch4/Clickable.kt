package kotlin_in_action.ch4

interface Clickable {
    fun click()

    fun showOff() = println("I'am clickable")
}

class Button : Clickable {
    override fun click() = println("I was clicked")
}

fun main(args:Array<String>) {
    Button().click()
}