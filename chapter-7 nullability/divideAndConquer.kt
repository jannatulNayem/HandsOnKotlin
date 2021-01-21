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
    val numberOfPerfectDivision = divideIfWhole(1024, 4)
    if(numberOfPerfectDivision != null){
        println("Yep, it divides ${numberOfPerfectDivision} times")
    }else{
        println("Not divisible :[")
    }
}
