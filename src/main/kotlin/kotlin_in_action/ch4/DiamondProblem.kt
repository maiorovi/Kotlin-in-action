package kotlin_in_action.ch4

class Obj : Clickable, Focusable {
    // kotlin compiler forces you to override method which is inherited from many places
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }

    override fun click() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

fun main(args: Array<String>) {
    Obj().showOff()
}
