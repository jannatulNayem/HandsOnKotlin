fun mathSum(length: Int, series: (Int) -> Int): Int{
    var sum = 0
    for(n in 1..length){
        sum += series(n)
    }
    return sum
}
val findNthSquare: (Int) -> Int = {
    pos: Int ->
    pos * pos
}

fun findNthFibo(n:Int):Int{
    if(n == 1 || n == 2) return 1

    var first = 1
    var second = 1
    var nthFibo = 0

    var i = 3
    while(i <= n){
        nthFibo = first + second
        first = second
        second = nthFibo
        i++
    }

    return  nthFibo
}
fun main() {
    println(mathSum(10, series = ::findNthFibo))
}
