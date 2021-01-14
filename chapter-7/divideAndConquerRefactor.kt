fun divideIfWhole(value: Int, divisor: Int): Int?{

    var givenNumber =value
    var count = 0
    while(givenNumber != 0){
        if(givenNumber % divisor != 0) return null
        givenNumber = givenNumber - divisor
        count++
    }
    return count
}
fun main(){
    val result = divideIfWhole(1024, 4)
    val finalMessage = result?: 0
    println("It divides $finalMessage times")
}
