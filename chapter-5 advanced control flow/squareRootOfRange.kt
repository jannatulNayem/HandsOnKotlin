import kotlin.math.sqrt

fun squareRootOfRange(){
    val range = 1..10
    for(i in range){
        println(sqrt(i.toDouble()))
    }
}
