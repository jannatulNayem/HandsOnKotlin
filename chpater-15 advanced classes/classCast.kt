open class A{
    init{
        println("I am <A>")
    }
    open fun whoAmI(){
        println("I am A")
    }
}
open class B:A(){
    init{
       println("I am <B>")
    }

    override fun whoAmI() {
        println("I am B")
    }
}
class C:B(){
    init {
        println("I am <C>")
    }
    override fun whoAmI() {
        println("I am C")
    }
}

fun main() {
    var c = C()
    var cToA = c as A
    cToA.whoAmI()
    var a = A()
    var aToC = a as C

}