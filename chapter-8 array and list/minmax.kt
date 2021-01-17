
fun main(){
    val myArr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(minMax(myArr))
}
fun minMax(numbers: Array<Int>): Pair<Int,Int>?{
    if(numbers.isEmpty())return null
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE

    for(i in 0..numbers.size-1){
        if(numbers[i] < min){
            min = numbers[i]
        }
        if(numbers[i] > max){
            max = numbers[i]
        }
    }
    return Pair(min, max)
}
