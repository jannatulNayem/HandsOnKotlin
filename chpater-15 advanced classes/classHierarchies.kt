open class A{
    init{
        println("I am <A>")
    }
}
open class B:A(){
    init{
       println("I am <B>")
    }
}
class C:B(){
    init {
        println("I am <C>")
    }
}

fun main() {
    var c = C()
}