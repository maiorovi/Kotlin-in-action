package kotlin_in_action.ch4

//unpacked version of following declaration:
//class User(val nickName: String)
class User constructor(_nickname: String) {
    val nickName: String

    init {
        nickName = _nickname
    }

}

class UserPrivate private constructor(nickName: String) {
    val nickName: String

    init {
        this.nickName = nickName
    }

    fun getMessage(): String = "Hello World!"

    companion object {
        fun getPrivateUser(nickName: String): UserPrivate = UserPrivate(nickName)
    }
}

open class MyView {
    private val param1:String
    private val param2:String

    constructor(param1: String, param2:String) {
        this.param1 = param1
        this.param2 = param2
    }
}

class MyViewAncestor : MyView {
    constructor(p1:String,p2:String) : super(p1,p2) {

    }
}

fun main(args:Array<String>) {
    UserPrivate.getPrivateUser("IMDB")
}