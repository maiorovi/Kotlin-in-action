package kotlin_in_action.ch4

//by default kotlin classes is final
//class Example  {
open class Example {
    //method by default is also final
    fun showExample() = println("Hello World!")
}

class Example1 : Example() {
//    fun showExample
}