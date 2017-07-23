package kotlin_in_action.ch4

import java.io.Serializable

interface State : Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state:State)
}

class Button1 : View {
    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) {

    }
    // such class declaration inside other class is equal to static classes in Java
    class ButtonState : State

    //if you want to create inner class which have reference to outer class you have to do it like that:
    inner class ButtonStateInner : State
}

class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}