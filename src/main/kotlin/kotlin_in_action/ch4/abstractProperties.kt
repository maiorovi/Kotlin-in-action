package kotlin_in_action.ch4

interface MyUser {
    val nickName: String
}

// interface is allowed to contain abstract properties; lets look at possible implementation
class PrivateUser(override val nickName: String) : MyUser

class PrivateUser1:MyUser {
    override val nickName: String = "5"
}


//getter and setter defined for a field
class PrivateUser2: MyUser {
    override var nickName: String = "undefined"
    get() {
        return field
    }
    set(value: String) {
        field = value
    }
}


//private setter for a field
class LengthCounter {
    var counter: Int = 0
    private set

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main(args:Array<String>) {
    val counter = LengthCounter()
}