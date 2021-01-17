import java.util.Random
val random = Random()

fun rand(from: Int, to:Int):Int{
    return random.nextInt(to - from) + from
}

fun randomized(array:Array<Int>): Array<Int>{

    for(i in 0..array.size-1){
        val randomIndex = rand(0, array.size-1)
        val temp = array[i]
        array[i] = array[randomIndex]
        array[randomIndex] = temp
    }
    return array
}
fun main(){
    val myArr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val randomizedArr = randomized(myArr)
    println(randomizedArr.joinToString())
}
