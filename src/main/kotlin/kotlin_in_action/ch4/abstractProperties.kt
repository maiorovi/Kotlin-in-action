package kotlin_in_action.ch4

interface MyUser {
    val nickName: String
}

// interface is allowed to contain abstract properties; lets look at possible implementation
class PrivateUser(override val nickName: String) : MyUser